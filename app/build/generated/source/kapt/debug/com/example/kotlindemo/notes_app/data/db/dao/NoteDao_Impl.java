package com.example.kotlindemo.notes_app.data.db.dao;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RxRoom;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.kotlindemo.notes_app.data.model.NoteEntity;
import io.reactivex.Observable;
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
public final class NoteDao_Impl implements NoteDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<NoteEntity> __insertionAdapterOfNoteEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllNotes;

  public NoteDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfNoteEntity = new EntityInsertionAdapter<NoteEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `notes_table` (`local_id`,`description`,`date`,`title`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, NoteEntity value) {
        stmt.bindLong(1, value.getLocal_id());
        if (value.getDescription() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDescription());
        }
        if (value.getDate() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDate());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTitle());
        }
      }
    };
    this.__preparedStmtOfDeleteAllNotes = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "delete from notes_table";
        return _query;
      }
    };
  }

  @Override
  public void insert(final NoteEntity notesEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfNoteEntity.insert(notesEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAllNotes() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllNotes.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllNotes.release(_stmt);
    }
  }

  @Override
  public Observable<List<NoteEntity>> getNotesList() {
    final String _sql = "SELECT * FROM notes_table ORDER BY local_id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createObservable(__db, false, new String[]{"notes_table"}, new Callable<List<NoteEntity>>() {
      @Override
      public List<NoteEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfLocalId = CursorUtil.getColumnIndexOrThrow(_cursor, "local_id");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final List<NoteEntity> _result = new ArrayList<NoteEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final NoteEntity _item;
            final int _tmpLocal_id;
            _tmpLocal_id = _cursor.getInt(_cursorIndexOfLocalId);
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final String _tmpDate;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmpDate = null;
            } else {
              _tmpDate = _cursor.getString(_cursorIndexOfDate);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            _item = new NoteEntity(_tmpLocal_id,_tmpDescription,_tmpDate,_tmpTitle);
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
