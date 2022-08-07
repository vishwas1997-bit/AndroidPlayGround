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
public final class LivesInDao_Impl implements LivesInDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<LivesInEntity> __insertionAdapterOfLivesInEntity;

  public LivesInDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfLivesInEntity = new EntityInsertionAdapter<LivesInEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `livesIn_table` (`id`,`userIdInLivesInTable`,`livesIn`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, LivesInEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getUserId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUserId());
        }
        if (value.getLivesIn() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getLivesIn());
        }
      }
    };
  }

  @Override
  public void insertLivesIn(final LivesInEntity livesInEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfLivesInEntity.insert(livesInEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
