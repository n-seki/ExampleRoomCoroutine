package com.nseki.samplemetasplite.presentation

import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nseki.samplemetasplite.R
import dagger.Module
import dagger.android.AndroidInjection
import dagger.android.ContributesAndroidInjector
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var viewModelFactory: ViewModelFactory<MainViewModel>
    private val mainViewModel by viewModels<MainViewModel> { viewModelFactory }

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel.dbVersion.observe(this, Observer {
            findViewById<TextView>(R.id.version).run {
                text = it
            }
        })
        mainViewModel.allTableName.observe(this, Observer { tableNames ->
            val list = findViewById<RecyclerView>(R.id.table_names_list)
            val adapter = (list.adapter as? TableNameAdapter) ?: TableNameAdapter(this).also {
                val layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
                list.layoutManager = layoutManager
                list.addItemDecoration(DividerItemDecoration(this, layoutManager.orientation))
                list.adapter = it
            }
            adapter.submitList(tableNames)
        })
    }
}

@Module
interface MainActivityModule {

    @ContributesAndroidInjector
    fun contributeMainActivity(): MainActivity
}