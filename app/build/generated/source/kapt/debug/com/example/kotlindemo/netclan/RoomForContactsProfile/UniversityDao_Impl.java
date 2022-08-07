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
public final class UniversityDao_Impl implements UniversityDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<UniversityEntity> __insertionAdapterOfUniversityEntity;

  public UniversityDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUniversityEntity = new EntityInsertionAdapter<UniversityEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `university_table` (`id`,`userIdInUniversityTable`,`universityName`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UniversityEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getUserId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUserId());
        }
        if (value.getUniversityName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getUniversityName());
        }
      }
    };
  }

  @Override
  public void insertUnoversity(final UniversityEntity universityEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfUniversityEntity.insert(universityEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
