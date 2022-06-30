package com.example.kotlindemo.RoomDatabaseDemo.data;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public final class CourseDatabase_Impl extends CourseDatabase {
  private volatile Dao _dao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `course_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `courseName` TEXT, `courseDescription` TEXT, `courseDuration` TEXT, `courseTeacher` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"cde3650602d31112efa786d319410606\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `course_table`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsCourseTable = new HashMap<String, TableInfo.Column>(5);
        _columnsCourseTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsCourseTable.put("courseName", new TableInfo.Column("courseName", "TEXT", false, 0));
        _columnsCourseTable.put("courseDescription", new TableInfo.Column("courseDescription", "TEXT", false, 0));
        _columnsCourseTable.put("courseDuration", new TableInfo.Column("courseDuration", "TEXT", false, 0));
        _columnsCourseTable.put("courseTeacher", new TableInfo.Column("courseTeacher", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCourseTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCourseTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCourseTable = new TableInfo("course_table", _columnsCourseTable, _foreignKeysCourseTable, _indicesCourseTable);
        final TableInfo _existingCourseTable = TableInfo.read(_db, "course_table");
        if (! _infoCourseTable.equals(_existingCourseTable)) {
          throw new IllegalStateException("Migration didn't properly handle course_table(com.example.kotlindemo.RoomDatabaseDemo.data.CourseModal).\n"
                  + " Expected:\n" + _infoCourseTable + "\n"
                  + " Found:\n" + _existingCourseTable);
        }
      }
    }, "cde3650602d31112efa786d319410606", "270774c66302e7072dd6c3171d983e72");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "course_table");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `course_table`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public Dao Dao() {
    if (_dao != null) {
      return _dao;
    } else {
      synchronized(this) {
        if(_dao == null) {
          _dao = new Dao_Impl(this);
        }
        return _dao;
      }
    }
  }
}
