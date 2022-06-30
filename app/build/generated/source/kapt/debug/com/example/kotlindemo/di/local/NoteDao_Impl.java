package com.example.kotlindemo.di.local;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public final class NoteDao_Impl implements NoteDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfNoteEntity;

  public NoteDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfNoteEntity = new EntityInsertionAdapter<NoteEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `note_entity`(`id`,`data`) VALUES (nullif(?, 0),?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, NoteEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getData() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getData());
        }
      }
    };
  }

  @Override
  public void insert(NoteEntity data) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfNoteEntity.insert(data);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<NoteEntity> getNoteList() {
    final String _sql = "SELECT * FROM note_entity ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfData = _cursor.getColumnIndexOrThrow("data");
      final List<NoteEntity> _result = new ArrayList<NoteEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final NoteEntity _item;
        _item = new NoteEntity();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final String _tmpData;
        _tmpData = _cursor.getString(_cursorIndexOfData);
        _item.setData(_tmpData);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
