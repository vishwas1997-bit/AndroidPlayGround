package com.example.kotlindemo.RoomDatabaseDemo.data;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
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
public final class Dao_Impl implements Dao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<CourseModal> __insertionAdapterOfCourseModal;

  private final EntityDeletionOrUpdateAdapter<CourseModal> __deletionAdapterOfCourseModal;

  private final EntityDeletionOrUpdateAdapter<CourseModal> __updateAdapterOfCourseModal;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllCourses;

  public Dao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCourseModal = new EntityInsertionAdapter<CourseModal>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `course_table` (`id`,`courseName`,`courseDescription`,`courseDuration`,`courseTeacher`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CourseModal value) {
        stmt.bindLong(1, value.getId());
        if (value.getCourseName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCourseName());
        }
        if (value.getCourseDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCourseDescription());
        }
        if (value.getCourseDuration() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCourseDuration());
        }
        if (value.getCourseTeacher() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getCourseTeacher());
        }
      }
    };
    this.__deletionAdapterOfCourseModal = new EntityDeletionOrUpdateAdapter<CourseModal>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `course_table` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CourseModal value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfCourseModal = new EntityDeletionOrUpdateAdapter<CourseModal>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `course_table` SET `id` = ?,`courseName` = ?,`courseDescription` = ?,`courseDuration` = ?,`courseTeacher` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CourseModal value) {
        stmt.bindLong(1, value.getId());
        if (value.getCourseName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCourseName());
        }
        if (value.getCourseDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCourseDescription());
        }
        if (value.getCourseDuration() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCourseDuration());
        }
        if (value.getCourseTeacher() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getCourseTeacher());
        }
        stmt.bindLong(6, value.getId());
      }
    };
    this.__preparedStmtOfDeleteAllCourses = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM course_table";
        return _query;
      }
    };
  }

  @Override
  public void insert(final CourseModal model) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCourseModal.insert(model);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final CourseModal model) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfCourseModal.handle(model);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final CourseModal model) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfCourseModal.handle(model);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAllCourses() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllCourses.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllCourses.release(_stmt);
    }
  }

  @Override
  public LiveData<List<CourseModal>> getAllCourses() {
    final String _sql = "SELECT * FROM course_table ORDER BY courseName ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"course_table"}, false, new Callable<List<CourseModal>>() {
      @Override
      public List<CourseModal> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCourseName = CursorUtil.getColumnIndexOrThrow(_cursor, "courseName");
          final int _cursorIndexOfCourseDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "courseDescription");
          final int _cursorIndexOfCourseDuration = CursorUtil.getColumnIndexOrThrow(_cursor, "courseDuration");
          final int _cursorIndexOfCourseTeacher = CursorUtil.getColumnIndexOrThrow(_cursor, "courseTeacher");
          final List<CourseModal> _result = new ArrayList<CourseModal>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final CourseModal _item;
            final String _tmpCourseName;
            if (_cursor.isNull(_cursorIndexOfCourseName)) {
              _tmpCourseName = null;
            } else {
              _tmpCourseName = _cursor.getString(_cursorIndexOfCourseName);
            }
            final String _tmpCourseDescription;
            if (_cursor.isNull(_cursorIndexOfCourseDescription)) {
              _tmpCourseDescription = null;
            } else {
              _tmpCourseDescription = _cursor.getString(_cursorIndexOfCourseDescription);
            }
            final String _tmpCourseDuration;
            if (_cursor.isNull(_cursorIndexOfCourseDuration)) {
              _tmpCourseDuration = null;
            } else {
              _tmpCourseDuration = _cursor.getString(_cursorIndexOfCourseDuration);
            }
            _item = new CourseModal(_tmpCourseName,_tmpCourseDescription,_tmpCourseDuration);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            final String _tmpCourseTeacher;
            if (_cursor.isNull(_cursorIndexOfCourseTeacher)) {
              _tmpCourseTeacher = null;
            } else {
              _tmpCourseTeacher = _cursor.getString(_cursorIndexOfCourseTeacher);
            }
            _item.setCourseTeacher(_tmpCourseTeacher);
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
  public List<CourseModal> getAllCoursesList() {
    final String _sql = "SELECT * FROM course_table ORDER BY courseName ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfCourseName = CursorUtil.getColumnIndexOrThrow(_cursor, "courseName");
      final int _cursorIndexOfCourseDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "courseDescription");
      final int _cursorIndexOfCourseDuration = CursorUtil.getColumnIndexOrThrow(_cursor, "courseDuration");
      final int _cursorIndexOfCourseTeacher = CursorUtil.getColumnIndexOrThrow(_cursor, "courseTeacher");
      final List<CourseModal> _result = new ArrayList<CourseModal>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final CourseModal _item;
        final String _tmpCourseName;
        if (_cursor.isNull(_cursorIndexOfCourseName)) {
          _tmpCourseName = null;
        } else {
          _tmpCourseName = _cursor.getString(_cursorIndexOfCourseName);
        }
        final String _tmpCourseDescription;
        if (_cursor.isNull(_cursorIndexOfCourseDescription)) {
          _tmpCourseDescription = null;
        } else {
          _tmpCourseDescription = _cursor.getString(_cursorIndexOfCourseDescription);
        }
        final String _tmpCourseDuration;
        if (_cursor.isNull(_cursorIndexOfCourseDuration)) {
          _tmpCourseDuration = null;
        } else {
          _tmpCourseDuration = _cursor.getString(_cursorIndexOfCourseDuration);
        }
        _item = new CourseModal(_tmpCourseName,_tmpCourseDescription,_tmpCourseDuration);
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final String _tmpCourseTeacher;
        if (_cursor.isNull(_cursorIndexOfCourseTeacher)) {
          _tmpCourseTeacher = null;
        } else {
          _tmpCourseTeacher = _cursor.getString(_cursorIndexOfCourseTeacher);
        }
        _item.setCourseTeacher(_tmpCourseTeacher);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
