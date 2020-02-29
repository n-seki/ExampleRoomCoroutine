package com.nseki.samplemetasplite.presentation

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.nseki.samplemetasplite.R

class TableNameAdapter(
    context: Context
) : ListAdapter<String, TableNameViewHolder>(DiffCallback) {

    private val layoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TableNameViewHolder {
        val view = layoutInflater.inflate(R.layout.view_table_name, parent, false)
        return TableNameViewHolder(view)
    }

    override fun onBindViewHolder(holder: TableNameViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

private object DiffCallback : DiffUtil.ItemCallback<String>() {
    override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem == newItem
    }
}

class TableNameViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val tableNameTextViw = view.findViewById<TextView>(R.id.table_name)
    fun bind(tableName: String) {
        tableNameTextViw.text = tableName
    }
}