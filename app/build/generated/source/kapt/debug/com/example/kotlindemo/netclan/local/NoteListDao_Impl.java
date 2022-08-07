package com.example.kotlindemo.netclan.local;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class NoteListDao_Impl implements NoteListDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<NotesEntity> __insertionAdapterOfNotesEntity;

  private final EntityDeletionOrUpdateAdapter<NotesPartialEntityForUpdate> __updateAdapterOfNotesPartialEntityForUpdateAsNotesEntity;

  private final EntityDeletionOrUpdateAdapter<NotesPartialEntityForDelete> __updateAdapterOfNotesPartialEntityForDeleteAsNotesEntity;

  private final EntityDeletionOrUpdateAdapter<NotesEntityPartial> __updateAdapterOfNotesEntityPartialAsNotesEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllNotes;

  public NoteListDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfNotesEntity = new EntityInsertionAdapter<NotesEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `notes_table` (`local_id`,`userId`,`description`,`date`,`createNoteFlag`,`updateNoteFlag`,`deleteNoteFlag`,`server_id`,`title`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, NotesEntity value) {
        stmt.bindLong(1, value.getLocal_id());
        if (value.getUserId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUserId());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        if (value.getDate() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDate());
        }
        stmt.bindLong(5, value.getCreateNoteFlag());
        stmt.bindLong(6, value.getUpdateNoteFlag());
        stmt.bindLong(7, value.getDeleteNoteFlag());
        if (value.getServer_id() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getServer_id());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getTitle());
        }
      }
    };
    this.__updateAdapterOfNotesPartialEntityForUpdateAsNotesEntity = new EntityDeletionOrUpdateAdapter<NotesPartialEntityForUpdate>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `notes_table` SET `local_id` = ?,`description` = ?,`title` = ?,`date` = ?,`updateNoteFlag` = ? WHERE `local_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, NotesPartialEntityForUpdate value) {
        stmt.bindLong(1, value.getLocal_id());
        if (value.getDescription() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDescription());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTitle());
        }
        if (value.getDate() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDate());
        }
        stmt.bindLong(5, value.getUpdateNoteFlag());
        stmt.bindLong(6, value.getLocal_id());
      }
    };
    this.__updateAdapterOfNotesPartialEntityForDeleteAsNotesEntity = new EntityDeletionOrUpdateAdapter<NotesPartialEntityForDelete>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `notes_table` SET `local_id` = ?,`deleteNoteFlag` = ? WHERE `local_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, NotesPartialEntityForDelete value) {
        stmt.bindLong(1, value.getLocal_id());
        stmt.bindLong(2, value.getDeleteNoteFlag());
        stmt.bindLong(3, value.getLocal_id());
      }
    };
    this.__updateAdapterOfNotesEntityPartialAsNotesEntity = new EntityDeletionOrUpdateAdapter<NotesEntityPartial>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `notes_table` SET `local_id` = ?,`createNoteFlag` = ?,`server_id` = ? WHERE `local_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, NotesEntityPartial value) {
        stmt.bindLong(1, value.getLocal_id());
        stmt.bindLong(2, value.getCreateNoteFlag());
        if (value.getServer_id() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getServer_id());
        }
        stmt.bindLong(4, value.getLocal_id());
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
  public void insert(final NotesEntity notesEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfNotesEntity.insert(notesEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateEditNotes(final NotesPartialEntityForUpdate... notesPartialEntityForUpdates) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfNotesPartialEntityForUpdateAsNotesEntity.handleMultiple(notesPartialEntityForUpdates);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final NotesPartialEntityForDelete... entityForDeletes) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfNotesPartialEntityForDeleteAsNotesEntity.handleMultiple(entityForDeletes);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateCreateFlag(final NotesEntityPartial... notesEntityPartials) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfNotesEntityPartialAsNotesEntity.handleMultiple(notesEntityPartials);
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
  public LiveData<List<NotesEntity>> getNotesList(final String userId, final int flag) {
    final String _sql = "SELECT * FROM notes_table WHERE userId = ? and deleteNoteFlag = ? ORDER BY local_id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (userId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userId);
    }
    _argIndex = 2;
    _statement.bindLong(_argIndex, flag);
    return __db.getInvalidationTracker().createLiveData(new String[]{"notes_table"}, false, new Callable<List<NotesEntity>>() {
      @Override
      public List<NotesEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfLocalId = CursorUtil.getColumnIndexOrThrow(_cursor, "local_id");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfCreateNoteFlag = CursorUtil.getColumnIndexOrThrow(_cursor, "createNoteFlag");
          final int _cursorIndexOfUpdateNoteFlag = CursorUtil.getColumnIndexOrThrow(_cursor, "updateNoteFlag");
          final int _cursorIndexOfDeleteNoteFlag = CursorUtil.getColumnIndexOrThrow(_cursor, "deleteNoteFlag");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final List<NotesEntity> _result = new ArrayList<NotesEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final NotesEntity _item;
            _item = new NotesEntity();
            final int _tmpLocal_id;
            _tmpLocal_id = _cursor.getInt(_cursorIndexOfLocalId);
            _item.setLocal_id(_tmpLocal_id);
            final String _tmpUserId;
            if (_cursor.isNull(_cursorIndexOfUserId)) {
              _tmpUserId = null;
            } else {
              _tmpUserId = _cursor.getString(_cursorIndexOfUserId);
            }
            _item.setUserId(_tmpUserId);
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            _item.setDescription(_tmpDescription);
            final String _tmpDate;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmpDate = null;
            } else {
              _tmpDate = _cursor.getString(_cursorIndexOfDate);
            }
            _item.setDate(_tmpDate);
            final int _tmpCreateNoteFlag;
            _tmpCreateNoteFlag = _cursor.getInt(_cursorIndexOfCreateNoteFlag);
            _item.setCreateNoteFlag(_tmpCreateNoteFlag);
            final int _tmpUpdateNoteFlag;
            _tmpUpdateNoteFlag = _cursor.getInt(_cursorIndexOfUpdateNoteFlag);
            _item.setUpdateNoteFlag(_tmpUpdateNoteFlag);
            final int _tmpDeleteNoteFlag;
            _tmpDeleteNoteFlag = _cursor.getInt(_cursorIndexOfDeleteNoteFlag);
            _item.setDeleteNoteFlag(_tmpDeleteNoteFlag);
            final String _tmpServer_id;
            if (_cursor.isNull(_cursorIndexOfServerId)) {
              _tmpServer_id = null;
            } else {
              _tmpServer_id = _cursor.getString(_cursorIndexOfServerId);
            }
            _item.setServer_id(_tmpServer_id);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            _item.setTitle(_tmpTitle);
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

  @Override
  public LiveData<List<NotesEntity>> getNotesWithCreateFlag(final int flag) {
    final String _sql = "SELECT * FROM notes_table WHERE createNoteFlag = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, flag);
    return __db.getInvalidationTracker().createLiveData(new String[]{"notes_table"}, false, new Callable<List<NotesEntity>>() {
      @Override
      public List<NotesEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfLocalId = CursorUtil.getColumnIndexOrThrow(_cursor, "local_id");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfCreateNoteFlag = CursorUtil.getColumnIndexOrThrow(_cursor, "createNoteFlag");
          final int _cursorIndexOfUpdateNoteFlag = CursorUtil.getColumnIndexOrThrow(_cursor, "updateNoteFlag");
          final int _cursorIndexOfDeleteNoteFlag = CursorUtil.getColumnIndexOrThrow(_cursor, "deleteNoteFlag");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final List<NotesEntity> _result = new ArrayList<NotesEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final NotesEntity _item;
            _item = new NotesEntity();
            final int _tmpLocal_id;
            _tmpLocal_id = _cursor.getInt(_cursorIndexOfLocalId);
            _item.setLocal_id(_tmpLocal_id);
            final String _tmpUserId;
            if (_cursor.isNull(_cursorIndexOfUserId)) {
              _tmpUserId = null;
            } else {
              _tmpUserId = _cursor.getString(_cursorIndexOfUserId);
            }
            _item.setUserId(_tmpUserId);
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            _item.setDescription(_tmpDescription);
            final String _tmpDate;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmpDate = null;
            } else {
              _tmpDate = _cursor.getString(_cursorIndexOfDate);
            }
            _item.setDate(_tmpDate);
            final int _tmpCreateNoteFlag;
            _tmpCreateNoteFlag = _cursor.getInt(_cursorIndexOfCreateNoteFlag);
            _item.setCreateNoteFlag(_tmpCreateNoteFlag);
            final int _tmpUpdateNoteFlag;
            _tmpUpdateNoteFlag = _cursor.getInt(_cursorIndexOfUpdateNoteFlag);
            _item.setUpdateNoteFlag(_tmpUpdateNoteFlag);
            final int _tmpDeleteNoteFlag;
            _tmpDeleteNoteFlag = _cursor.getInt(_cursorIndexOfDeleteNoteFlag);
            _item.setDeleteNoteFlag(_tmpDeleteNoteFlag);
            final String _tmpServer_id;
            if (_cursor.isNull(_cursorIndexOfServerId)) {
              _tmpServer_id = null;
            } else {
              _tmpServer_id = _cursor.getString(_cursorIndexOfServerId);
            }
            _item.setServer_id(_tmpServer_id);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            _item.setTitle(_tmpTitle);
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

  @Override
  public LiveData<List<NotesEntity>> getNotesWithUpdateFlag(final int flag) {
    final String _sql = "select * from notes_table where updateNoteFlag = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, flag);
    return __db.getInvalidationTracker().createLiveData(new String[]{"notes_table"}, false, new Callable<List<NotesEntity>>() {
      @Override
      public List<NotesEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfLocalId = CursorUtil.getColumnIndexOrThrow(_cursor, "local_id");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfCreateNoteFlag = CursorUtil.getColumnIndexOrThrow(_cursor, "createNoteFlag");
          final int _cursorIndexOfUpdateNoteFlag = CursorUtil.getColumnIndexOrThrow(_cursor, "updateNoteFlag");
          final int _cursorIndexOfDeleteNoteFlag = CursorUtil.getColumnIndexOrThrow(_cursor, "deleteNoteFlag");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final List<NotesEntity> _result = new ArrayList<NotesEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final NotesEntity _item;
            _item = new NotesEntity();
            final int _tmpLocal_id;
            _tmpLocal_id = _cursor.getInt(_cursorIndexOfLocalId);
            _item.setLocal_id(_tmpLocal_id);
            final String _tmpUserId;
            if (_cursor.isNull(_cursorIndexOfUserId)) {
              _tmpUserId = null;
            } else {
              _tmpUserId = _cursor.getString(_cursorIndexOfUserId);
            }
            _item.setUserId(_tmpUserId);
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            _item.setDescription(_tmpDescription);
            final String _tmpDate;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmpDate = null;
            } else {
              _tmpDate = _cursor.getString(_cursorIndexOfDate);
            }
            _item.setDate(_tmpDate);
            final int _tmpCreateNoteFlag;
            _tmpCreateNoteFlag = _cursor.getInt(_cursorIndexOfCreateNoteFlag);
            _item.setCreateNoteFlag(_tmpCreateNoteFlag);
            final int _tmpUpdateNoteFlag;
            _tmpUpdateNoteFlag = _cursor.getInt(_cursorIndexOfUpdateNoteFlag);
            _item.setUpdateNoteFlag(_tmpUpdateNoteFlag);
            final int _tmpDeleteNoteFlag;
            _tmpDeleteNoteFlag = _cursor.getInt(_cursorIndexOfDeleteNoteFlag);
            _item.setDeleteNoteFlag(_tmpDeleteNoteFlag);
            final String _tmpServer_id;
            if (_cursor.isNull(_cursorIndexOfServerId)) {
              _tmpServer_id = null;
            } else {
              _tmpServer_id = _cursor.getString(_cursorIndexOfServerId);
            }
            _item.setServer_id(_tmpServer_id);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            _item.setTitle(_tmpTitle);
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

  @Override
  public List<NotesEntity> getData(final String userId) {
    final String _sql = "SELECT * FROM notes_table WHERE userId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (userId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfLocalId = CursorUtil.getColumnIndexOrThrow(_cursor, "local_id");
      final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
      final int _cursorIndexOfCreateNoteFlag = CursorUtil.getColumnIndexOrThrow(_cursor, "createNoteFlag");
      final int _cursorIndexOfUpdateNoteFlag = CursorUtil.getColumnIndexOrThrow(_cursor, "updateNoteFlag");
      final int _cursorIndexOfDeleteNoteFlag = CursorUtil.getColumnIndexOrThrow(_cursor, "deleteNoteFlag");
      final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final List<NotesEntity> _result = new ArrayList<NotesEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final NotesEntity _item;
        _item = new NotesEntity();
        final int _tmpLocal_id;
        _tmpLocal_id = _cursor.getInt(_cursorIndexOfLocalId);
        _item.setLocal_id(_tmpLocal_id);
        final String _tmpUserId;
        if (_cursor.isNull(_cursorIndexOfUserId)) {
          _tmpUserId = null;
        } else {
          _tmpUserId = _cursor.getString(_cursorIndexOfUserId);
        }
        _item.setUserId(_tmpUserId);
        final String _tmpDescription;
        if (_cursor.isNull(_cursorIndexOfDescription)) {
          _tmpDescription = null;
        } else {
          _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        }
        _item.setDescription(_tmpDescription);
        final String _tmpDate;
        if (_cursor.isNull(_cursorIndexOfDate)) {
          _tmpDate = null;
        } else {
          _tmpDate = _cursor.getString(_cursorIndexOfDate);
        }
        _item.setDate(_tmpDate);
        final int _tmpCreateNoteFlag;
        _tmpCreateNoteFlag = _cursor.getInt(_cursorIndexOfCreateNoteFlag);
        _item.setCreateNoteFlag(_tmpCreateNoteFlag);
        final int _tmpUpdateNoteFlag;
        _tmpUpdateNoteFlag = _cursor.getInt(_cursorIndexOfUpdateNoteFlag);
        _item.setUpdateNoteFlag(_tmpUpdateNoteFlag);
        final int _tmpDeleteNoteFlag;
        _tmpDeleteNoteFlag = _cursor.getInt(_cursorIndexOfDeleteNoteFlag);
        _item.setDeleteNoteFlag(_tmpDeleteNoteFlag);
        final String _tmpServer_id;
        if (_cursor.isNull(_cursorIndexOfServerId)) {
          _tmpServer_id = null;
        } else {
          _tmpServer_id = _cursor.getString(_cursorIndexOfServerId);
        }
        _item.setServer_id(_tmpServer_id);
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        _item.setTitle(_tmpTitle);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LiveData<List<NotesEntity>> getNotesWithDeleteFlag(final int flag) {
    final String _sql = "select * from notes_table where deleteNoteFlag = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, flag);
    return __db.getInvalidationTracker().createLiveData(new String[]{"notes_table"}, false, new Callable<List<NotesEntity>>() {
      @Override
      public List<NotesEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfLocalId = CursorUtil.getColumnIndexOrThrow(_cursor, "local_id");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfCreateNoteFlag = CursorUtil.getColumnIndexOrThrow(_cursor, "createNoteFlag");
          final int _cursorIndexOfUpdateNoteFlag = CursorUtil.getColumnIndexOrThrow(_cursor, "updateNoteFlag");
          final int _cursorIndexOfDeleteNoteFlag = CursorUtil.getColumnIndexOrThrow(_cursor, "deleteNoteFlag");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final List<NotesEntity> _result = new ArrayList<NotesEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final NotesEntity _item;
            _item = new NotesEntity();
            final int _tmpLocal_id;
            _tmpLocal_id = _cursor.getInt(_cursorIndexOfLocalId);
            _item.setLocal_id(_tmpLocal_id);
            final String _tmpUserId;
            if (_cursor.isNull(_cursorIndexOfUserId)) {
              _tmpUserId = null;
            } else {
              _tmpUserId = _cursor.getString(_cursorIndexOfUserId);
            }
            _item.setUserId(_tmpUserId);
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            _item.setDescription(_tmpDescription);
            final String _tmpDate;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmpDate = null;
            } else {
              _tmpDate = _cursor.getString(_cursorIndexOfDate);
            }
            _item.setDate(_tmpDate);
            final int _tmpCreateNoteFlag;
            _tmpCreateNoteFlag = _cursor.getInt(_cursorIndexOfCreateNoteFlag);
            _item.setCreateNoteFlag(_tmpCreateNoteFlag);
            final int _tmpUpdateNoteFlag;
            _tmpUpdateNoteFlag = _cursor.getInt(_cursorIndexOfUpdateNoteFlag);
            _item.setUpdateNoteFlag(_tmpUpdateNoteFlag);
            final int _tmpDeleteNoteFlag;
            _tmpDeleteNoteFlag = _cursor.getInt(_cursorIndexOfDeleteNoteFlag);
            _item.setDeleteNoteFlag(_tmpDeleteNoteFlag);
            final String _tmpServer_id;
            if (_cursor.isNull(_cursorIndexOfServerId)) {
              _tmpServer_id = null;
            } else {
              _tmpServer_id = _cursor.getString(_cursorIndexOfServerId);
            }
            _item.setServer_id(_tmpServer_id);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            _item.setTitle(_tmpTitle);
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

  @Override
  public int getSize() {
    final String _sql = "select count(*) from notes_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public void deleteNoPermanently(final List<Integer> notesEntity) {
    __db.assertNotSuspendingTransaction();
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("delete from notes_table where local_id in (");
    final int _inputSize = notesEntity.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final SupportSQLiteStatement _stmt = __db.compileStatement(_sql);
    int _argIndex = 1;
    for (Integer _item : notesEntity) {
      if (_item == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindLong(_argIndex, _item);
      }
      _argIndex ++;
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
