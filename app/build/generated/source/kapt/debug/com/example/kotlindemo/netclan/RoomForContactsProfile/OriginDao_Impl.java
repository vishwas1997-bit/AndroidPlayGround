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
public final class OriginDao_Impl implements OriginDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<OriginEntity> __insertionAdapterOfOriginEntity;

  public OriginDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfOriginEntity = new EntityInsertionAdapter<OriginEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `origin_table` (`id`,`userIdInOriginTable`,`_cityName`,`_stateName`,`_status`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, OriginEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getUserId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUserId());
        }
        if (value.getCityName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCityName());
        }
        if (value.getStateName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getStateName());
        }
        if (value.getStatus() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getStatus());
        }
      }
    };
  }

  @Override
  public void insertOrigin(final OriginEntity originEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfOriginEntity.insert(originEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
