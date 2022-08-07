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
public final class SportsDao_Impl implements SportsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<SportsEntity> __insertionAdapterOfSportsEntity;

  public SportsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSportsEntity = new EntityInsertionAdapter<SportsEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `sports_table` (`id`,`userIdInSportsTable`,`sportsType`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SportsEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getUserId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUserId());
        }
        if (value.getSportsType() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getSportsType());
        }
      }
    };
  }

  @Override
  public void insertSporst(final SportsEntity sportsEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfSportsEntity.insert(sportsEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
