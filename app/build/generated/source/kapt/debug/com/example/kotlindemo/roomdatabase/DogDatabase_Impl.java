package com.example.kotlindemo.roomdatabase;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class DogDatabase_Impl extends DogDatabase {
  private volatile DogDao _dogDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Dog` (`dogId` INTEGER NOT NULL, `dogOwnerId` INTEGER NOT NULL, `name` TEXT NOT NULL, PRIMARY KEY(`dogId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Owner` (`ownerId` INTEGER NOT NULL, `name` TEXT NOT NULL, PRIMARY KEY(`ownerId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '4c6686e4066ad985c439f4c2bffca4e0')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Dog`");
        _db.execSQL("DROP TABLE IF EXISTS `Owner`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
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
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsDog = new HashMap<String, TableInfo.Column>(3);
        _columnsDog.put("dogId", new TableInfo.Column("dogId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDog.put("dogOwnerId", new TableInfo.Column("dogOwnerId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDog.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDog = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesDog = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoDog = new TableInfo("Dog", _columnsDog, _foreignKeysDog, _indicesDog);
        final TableInfo _existingDog = TableInfo.read(_db, "Dog");
        if (! _infoDog.equals(_existingDog)) {
          return new RoomOpenHelper.ValidationResult(false, "Dog(com.example.kotlindemo.roomdatabase.entity.Dog).\n"
                  + " Expected:\n" + _infoDog + "\n"
                  + " Found:\n" + _existingDog);
        }
        final HashMap<String, TableInfo.Column> _columnsOwner = new HashMap<String, TableInfo.Column>(2);
        _columnsOwner.put("ownerId", new TableInfo.Column("ownerId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOwner.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysOwner = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesOwner = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoOwner = new TableInfo("Owner", _columnsOwner, _foreignKeysOwner, _indicesOwner);
        final TableInfo _existingOwner = TableInfo.read(_db, "Owner");
        if (! _infoOwner.equals(_existingOwner)) {
          return new RoomOpenHelper.ValidationResult(false, "Owner(com.example.kotlindemo.roomdatabase.entity.Owner).\n"
                  + " Expected:\n" + _infoOwner + "\n"
                  + " Found:\n" + _existingOwner);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "4c6686e4066ad985c439f4c2bffca4e0", "97ab71ebcdaee0e9c8215869b42f9ac9");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "Dog","Owner");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `Dog`");
      _db.execSQL("DELETE FROM `Owner`");
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
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(DogDao.class, DogDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public DogDao dogDao() {
    if (_dogDao != null) {
      return _dogDao;
    } else {
      synchronized(this) {
        if(_dogDao == null) {
          _dogDao = new DogDao_Impl(this);
        }
        return _dogDao;
      }
    }
  }
}
