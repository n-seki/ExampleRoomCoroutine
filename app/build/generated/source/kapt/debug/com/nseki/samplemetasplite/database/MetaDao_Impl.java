package com.nseki.samplemetasplite.database;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MetaDao_Impl implements MetaDao {
  private final RoomDatabase __db;

  public MetaDao_Impl(RoomDatabase __db) {
    this.__db = __db;
  }

  @Override
  public Object getAllTableName(final MetaDatabase database,
      final Continuation<? super List<String>> p1) {
    return RoomDatabaseKt.withTransaction(__db, new Function1<Continuation<? super List<String>>, Object>() {
      @Override
      public Object invoke(Continuation<? super List<String>> __cont) {
        return MetaDao.DefaultImpls.getAllTableName(MetaDao_Impl.this, database, __cont);
      }
    }, p1);
  }

  @Override
  public Object getVersion(final Continuation<? super String> p0) {
    final String _sql = "SELECT sqlite_version();";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<String>() {
      @Override
      public String call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final String _result;
          if(_cursor.moveToFirst()) {
            final String _tmp;
            _tmp = _cursor.getString(0);
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }
}
