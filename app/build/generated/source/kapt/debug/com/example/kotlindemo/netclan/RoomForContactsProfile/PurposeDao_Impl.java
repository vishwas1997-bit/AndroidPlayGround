package com.example.kotlindemo.netclan.RoomForContactsProfile;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class PurposeDao_Impl implements PurposeDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<PurposeEntity> __insertionAdapterOfPurposeEntity;

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  public PurposeDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPurposeEntity = new EntityInsertionAdapter<PurposeEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `purpose_table` (`id`,`userIdInPurposeTable`,`purposeType`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PurposeEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getUserId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUserId());
        }
        if (value.getPurposeType() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPurposeType());
        }
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "delete from purpose_table where userIdInPurposeTable =?";
        return _query;
      }
    };
  }

  @Override
  public void insertPurpose(final PurposeEntity purposeEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfPurposeEntity.insert(purposeEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final String userId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDelete.acquire();
    int _argIndex = 1;
    if (userId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, userId);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDelete.release(_stmt);
    }
  }

  @Override
  public LiveData<List<PurposeEntity>> getPurpose(final String userId) {
    final String _sql = "select * from purpose_table where userIdInPurposeTable=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (userId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userId);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"purpose_table"}, false, new Callable<List<PurposeEntity>>() {
      @Override
      public List<PurposeEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userIdInPurposeTable");
          final int _cursorIndexOfPurposeType = CursorUtil.getColumnIndexOrThrow(_cursor, "purposeType");
          final List<PurposeEntity> _result = new ArrayList<PurposeEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final PurposeEntity _item;
            _item = new PurposeEntity();
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            final String _tmpUserId;
            if (_cursor.isNull(_cursorIndexOfUserId)) {
              _tmpUserId = null;
            } else {
              _tmpUserId = _cursor.getString(_cursorIndexOfUserId);
            }
            _item.setUserId(_tmpUserId);
            final String _tmpPurposeType;
            if (_cursor.isNull(_cursorIndexOfPurposeType)) {
              _tmpPurposeType = null;
            } else {
              _tmpPurposeType = _cursor.getString(_cursorIndexOfPurposeType);
            }
            _item.setPurposeType(_tmpPurposeType);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
