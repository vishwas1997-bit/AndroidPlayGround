package com.example.kotlindemo.roomdatabase;

import android.database.Cursor;
import androidx.collection.LongSparseArray;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.kotlindemo.roomdatabase.entity.Dog;
import com.example.kotlindemo.roomdatabase.entity.Owner;
import com.example.kotlindemo.roomdatabase.entity.ontoone.DogAndOwner;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class DogDao_Impl implements DogDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Dog> __insertionAdapterOfDog;

  private final EntityInsertionAdapter<Owner> __insertionAdapterOfOwner;

  public DogDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDog = new EntityInsertionAdapter<Dog>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Dog` (`dogId`,`dogOwnerId`,`name`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Dog value) {
        stmt.bindLong(1, value.getDogId());
        stmt.bindLong(2, value.getDogOwnerId());
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
      }
    };
    this.__insertionAdapterOfOwner = new EntityInsertionAdapter<Owner>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Owner` (`ownerId`,`name`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Owner value) {
        stmt.bindLong(1, value.getOwnerId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
      }
    };
  }

  @Override
  public void insertDog(final Dog dog) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfDog.insert(dog);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertOwner(final Owner owner) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfOwner.insert(owner);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<DogAndOwner> getDogsAndOwners() {
    final String _sql = "SELECT * FROM Owner";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
      try {
        final int _cursorIndexOfOwnerId = CursorUtil.getColumnIndexOrThrow(_cursor, "ownerId");
        final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
        final LongSparseArray<Dog> _collectionDog = new LongSparseArray<Dog>();
        while (_cursor.moveToNext()) {
          final long _tmpKey = _cursor.getLong(_cursorIndexOfOwnerId);
          _collectionDog.put(_tmpKey, null);
        }
        _cursor.moveToPosition(-1);
        __fetchRelationshipDogAscomExampleKotlindemoRoomdatabaseEntityDog(_collectionDog);
        final List<DogAndOwner> _result = new ArrayList<DogAndOwner>(_cursor.getCount());
        while(_cursor.moveToNext()) {
          final DogAndOwner _item;
          final Owner _tmpOwner;
          if (! (_cursor.isNull(_cursorIndexOfOwnerId) && _cursor.isNull(_cursorIndexOfName))) {
            final long _tmpOwnerId;
            _tmpOwnerId = _cursor.getLong(_cursorIndexOfOwnerId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            _tmpOwner = new Owner(_tmpOwnerId,_tmpName);
          }  else  {
            _tmpOwner = null;
          }
          Dog _tmpDog = null;
          final long _tmpKey_1 = _cursor.getLong(_cursorIndexOfOwnerId);
          _tmpDog = _collectionDog.get(_tmpKey_1);
          _item = new DogAndOwner(_tmpOwner,_tmpDog);
          _result.add(_item);
        }
        __db.setTransactionSuccessful();
        return _result;
      } finally {
        _cursor.close();
        _statement.release();
      }
    } finally {
      __db.endTransaction();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }

  private void __fetchRelationshipDogAscomExampleKotlindemoRoomdatabaseEntityDog(
      final LongSparseArray<Dog> _map) {
    if (_map.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      LongSparseArray<Dog> _tmpInnerMap = new LongSparseArray<Dog>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), null);
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshipDogAscomExampleKotlindemoRoomdatabaseEntityDog(_tmpInnerMap);
          _map.putAll(_tmpInnerMap);
          _tmpInnerMap = new LongSparseArray<Dog>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshipDogAscomExampleKotlindemoRoomdatabaseEntityDog(_tmpInnerMap);
        _map.putAll(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `dogId`,`dogOwnerId`,`name` FROM `Dog` WHERE `dogOwnerId` IN (");
    final int _inputSize = _map.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (int i = 0; i < _map.size(); i++) {
      long _item = _map.keyAt(i);
      _stmt.bindLong(_argIndex, _item);
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "dogOwnerId");
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfDogId = 0;
      final int _cursorIndexOfDogOwnerId = 1;
      final int _cursorIndexOfName = 2;
      while(_cursor.moveToNext()) {
        final long _tmpKey = _cursor.getLong(_itemKeyIndex);
        if (_map.containsKey(_tmpKey)) {
          final Dog _item_1;
          final long _tmpDogId;
          _tmpDogId = _cursor.getLong(_cursorIndexOfDogId);
          final long _tmpDogOwnerId;
          _tmpDogOwnerId = _cursor.getLong(_cursorIndexOfDogOwnerId);
          final String _tmpName;
          if (_cursor.isNull(_cursorIndexOfName)) {
            _tmpName = null;
          } else {
            _tmpName = _cursor.getString(_cursorIndexOfName);
          }
          _item_1 = new Dog(_tmpDogId,_tmpDogOwnerId,_tmpName);
          _map.put(_tmpKey, _item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }
}
