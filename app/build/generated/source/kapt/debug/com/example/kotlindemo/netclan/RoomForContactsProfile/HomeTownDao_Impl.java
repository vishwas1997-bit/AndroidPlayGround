package com.example.kotlindemo.netclan.RoomForContactsProfile;

import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class HomeTownDao_Impl implements HomeTownDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<HomeTownEntity> __insertionAdapterOfHomeTownEntity;

  public HomeTownDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfHomeTownEntity = new EntityInsertionAdapter<HomeTownEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `HomesTown_table` (`id`,`userIdInHomeTownTable`,`home_Town`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, HomeTownEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getUserId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUserId());
        }
        if (value.getHomeTown() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getHomeTown());
        }
      }
    };
  }

  @Override
  public void insertHomeTown(final HomeTownEntity homeTownEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfHomeTownEntity.insert(homeTownEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
