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
public final class MoviesDao_Impl implements MoviesDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<MoviesEntity> __insertionAdapterOfMoviesEntity;

  public MoviesDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMoviesEntity = new EntityInsertionAdapter<MoviesEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `movies_table` (`id`,`userIdInMoviesTable`,`movieType`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MoviesEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getUserId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUserId());
        }
        if (value.getMovieType() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getMovieType());
        }
      }
    };
  }

  @Override
  public void insertMovies(final MoviesEntity moviesEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfMoviesEntity.insert(moviesEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
