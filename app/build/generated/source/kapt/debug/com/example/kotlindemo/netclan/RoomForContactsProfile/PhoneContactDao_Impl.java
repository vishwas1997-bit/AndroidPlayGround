package com.example.kotlindemo.netclan.RoomForContactsProfile;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.kotlindemo.netclan.response_model.PhoneContactTable;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class PhoneContactDao_Impl extends PhoneContactDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<FindContactResponse> __insertionAdapterOfFindContactResponse;

  private final EntityInsertionAdapter<PhoneContactTable> __insertionAdapterOfPhoneContactTable;

  private final SharedSQLiteStatement __preparedStmtOfClearPhoneContactTable;

  private final SharedSQLiteStatement __preparedStmtOfClearFindContactTable;

  private final SharedSQLiteStatement __preparedStmtOfDeleteUserFromFindContactTable;

  private final SharedSQLiteStatement __preparedStmtOfUpdateInvStatus;

  public PhoneContactDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfFindContactResponse = new EntityInsertionAdapter<FindContactResponse>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `find_contact_response` (`fullPhone`,`_id`,`phone`,`firstName`,`lastName`,`profilePicUrl`,`userType`,`invStatus`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FindContactResponse value) {
        if (value.getFullPhone() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getFullPhone());
        }
        if (value.getId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getId());
        }
        if (value.getPhone() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, value.getPhone());
        }
        if (value.getFirstName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getFirstName());
        }
        if (value.getLastName() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getLastName());
        }
        if (value.getProfilePicUrl() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getProfilePicUrl());
        }
        if (value.getUserType() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, value.getUserType());
        }
        stmt.bindLong(8, value.getInvStatus());
      }
    };
    this.__insertionAdapterOfPhoneContactTable = new EntityInsertionAdapter<PhoneContactTable>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `phone_contact_table` (`fullPhone`,`name`,`photoUri`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PhoneContactTable value) {
        if (value.getFullPhone() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getFullPhone());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getPhotoUri() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPhotoUri());
        }
      }
    };
    this.__preparedStmtOfClearPhoneContactTable = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM phone_contact_table";
        return _query;
      }
    };
    this.__preparedStmtOfClearFindContactTable = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM find_contact_response";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteUserFromFindContactTable = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM find_contact_response where _id =?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateInvStatus = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE find_contact_response SET invStatus = ? where _id = ?";
        return _query;
      }
    };
  }

  @Override
  public void insert(final FindContactResponse inviteEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfFindContactResponse.insert(inviteEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAllPhoneContact(final List<PhoneContactTable> list) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfPhoneContactTable.insert(list);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAllInviteUser(final List<FindContactResponse> list) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfFindContactResponse.insert(list);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAndInsertInviteUserList(final List<FindContactResponse> list) {
    __db.beginTransaction();
    try {
      PhoneContactDao_Impl.super.deleteAndInsertInviteUserList(list);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAndInsertPhoneContactList(final List<PhoneContactTable> list) {
    __db.beginTransaction();
    try {
      PhoneContactDao_Impl.super.deleteAndInsertPhoneContactList(list);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void clearPhoneContactTable() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfClearPhoneContactTable.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfClearPhoneContactTable.release(_stmt);
    }
  }

  @Override
  public void clearFindContactTable() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfClearFindContactTable.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfClearFindContactTable.release(_stmt);
    }
  }

  @Override
  public void deleteUserFromFindContactTable(final String userId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteUserFromFindContactTable.acquire();
    int _argIndex = 1;
    if (userId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, userId);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteUserFromFindContactTable.release(_stmt);
    }
  }

  @Override
  public void updateInvStatus(final String userId, final int invStatus) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateInvStatus.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, invStatus);
    _argIndex = 2;
    if (userId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, userId);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateInvStatus.release(_stmt);
    }
  }

  @Override
  public LiveData<List<FindContactResponse>> getInviteUserLiveData() {
    final String _sql = "select * from find_contact_response order by firstName";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"find_contact_response"}, false, new Callable<List<FindContactResponse>>() {
      @Override
      public List<FindContactResponse> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfFullPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "fullPhone");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
          final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
          final int _cursorIndexOfFirstName = CursorUtil.getColumnIndexOrThrow(_cursor, "firstName");
          final int _cursorIndexOfLastName = CursorUtil.getColumnIndexOrThrow(_cursor, "lastName");
          final int _cursorIndexOfProfilePicUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "profilePicUrl");
          final int _cursorIndexOfUserType = CursorUtil.getColumnIndexOrThrow(_cursor, "userType");
          final int _cursorIndexOfInvStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "invStatus");
          final List<FindContactResponse> _result = new ArrayList<FindContactResponse>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final FindContactResponse _item;
            _item = new FindContactResponse();
            final String _tmpFullPhone;
            if (_cursor.isNull(_cursorIndexOfFullPhone)) {
              _tmpFullPhone = null;
            } else {
              _tmpFullPhone = _cursor.getString(_cursorIndexOfFullPhone);
            }
            _item.setFullPhone(_tmpFullPhone);
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            _item.setId(_tmpId);
            final Long _tmpPhone;
            if (_cursor.isNull(_cursorIndexOfPhone)) {
              _tmpPhone = null;
            } else {
              _tmpPhone = _cursor.getLong(_cursorIndexOfPhone);
            }
            _item.setPhone(_tmpPhone);
            final String _tmpFirstName;
            if (_cursor.isNull(_cursorIndexOfFirstName)) {
              _tmpFirstName = null;
            } else {
              _tmpFirstName = _cursor.getString(_cursorIndexOfFirstName);
            }
            _item.setFirstName(_tmpFirstName);
            final String _tmpLastName;
            if (_cursor.isNull(_cursorIndexOfLastName)) {
              _tmpLastName = null;
            } else {
              _tmpLastName = _cursor.getString(_cursorIndexOfLastName);
            }
            _item.setLastName(_tmpLastName);
            final String _tmpProfilePicUrl;
            if (_cursor.isNull(_cursorIndexOfProfilePicUrl)) {
              _tmpProfilePicUrl = null;
            } else {
              _tmpProfilePicUrl = _cursor.getString(_cursorIndexOfProfilePicUrl);
            }
            _item.setProfilePicUrl(_tmpProfilePicUrl);
            final Integer _tmpUserType;
            if (_cursor.isNull(_cursorIndexOfUserType)) {
              _tmpUserType = null;
            } else {
              _tmpUserType = _cursor.getInt(_cursorIndexOfUserType);
            }
            _item.setUserType(_tmpUserType);
            final int _tmpInvStatus;
            _tmpInvStatus = _cursor.getInt(_cursorIndexOfInvStatus);
            _item.setInvStatus(_tmpInvStatus);
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
  public List<FindContactResponse> getInviteUser() {
    final String _sql = "select * from find_contact_response order by firstName";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfFullPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "fullPhone");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
      final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
      final int _cursorIndexOfFirstName = CursorUtil.getColumnIndexOrThrow(_cursor, "firstName");
      final int _cursorIndexOfLastName = CursorUtil.getColumnIndexOrThrow(_cursor, "lastName");
      final int _cursorIndexOfProfilePicUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "profilePicUrl");
      final int _cursorIndexOfUserType = CursorUtil.getColumnIndexOrThrow(_cursor, "userType");
      final int _cursorIndexOfInvStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "invStatus");
      final List<FindContactResponse> _result = new ArrayList<FindContactResponse>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final FindContactResponse _item;
        _item = new FindContactResponse();
        final String _tmpFullPhone;
        if (_cursor.isNull(_cursorIndexOfFullPhone)) {
          _tmpFullPhone = null;
        } else {
          _tmpFullPhone = _cursor.getString(_cursorIndexOfFullPhone);
        }
        _item.setFullPhone(_tmpFullPhone);
        final String _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getString(_cursorIndexOfId);
        }
        _item.setId(_tmpId);
        final Long _tmpPhone;
        if (_cursor.isNull(_cursorIndexOfPhone)) {
          _tmpPhone = null;
        } else {
          _tmpPhone = _cursor.getLong(_cursorIndexOfPhone);
        }
        _item.setPhone(_tmpPhone);
        final String _tmpFirstName;
        if (_cursor.isNull(_cursorIndexOfFirstName)) {
          _tmpFirstName = null;
        } else {
          _tmpFirstName = _cursor.getString(_cursorIndexOfFirstName);
        }
        _item.setFirstName(_tmpFirstName);
        final String _tmpLastName;
        if (_cursor.isNull(_cursorIndexOfLastName)) {
          _tmpLastName = null;
        } else {
          _tmpLastName = _cursor.getString(_cursorIndexOfLastName);
        }
        _item.setLastName(_tmpLastName);
        final String _tmpProfilePicUrl;
        if (_cursor.isNull(_cursorIndexOfProfilePicUrl)) {
          _tmpProfilePicUrl = null;
        } else {
          _tmpProfilePicUrl = _cursor.getString(_cursorIndexOfProfilePicUrl);
        }
        _item.setProfilePicUrl(_tmpProfilePicUrl);
        final Integer _tmpUserType;
        if (_cursor.isNull(_cursorIndexOfUserType)) {
          _tmpUserType = null;
        } else {
          _tmpUserType = _cursor.getInt(_cursorIndexOfUserType);
        }
        _item.setUserType(_tmpUserType);
        final int _tmpInvStatus;
        _tmpInvStatus = _cursor.getInt(_cursorIndexOfInvStatus);
        _item.setInvStatus(_tmpInvStatus);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<String> getAllPhoneContacts() {
    final String _sql = "select fullPhone from phone_contact_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final List<String> _result = new ArrayList<String>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final String _item;
        if (_cursor.isNull(0)) {
          _item = null;
        } else {
          _item = _cursor.getString(0);
        }
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LiveData<List<PhoneContactTable>> getPhoneContact() {
    final String _sql = "select phone_contact_table.* from phone_contact_table where fullPhone not in (select fullPhone from find_contact_response union select fullPhone from connection_table union select fullPhone from contacts_table)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"phone_contact_table","find_contact_response","connection_table","contacts_table"}, false, new Callable<List<PhoneContactTable>>() {
      @Override
      public List<PhoneContactTable> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfFullPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "fullPhone");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfPhotoUri = CursorUtil.getColumnIndexOrThrow(_cursor, "photoUri");
          final List<PhoneContactTable> _result = new ArrayList<PhoneContactTable>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final PhoneContactTable _item;
            final String _tmpFullPhone;
            if (_cursor.isNull(_cursorIndexOfFullPhone)) {
              _tmpFullPhone = null;
            } else {
              _tmpFullPhone = _cursor.getString(_cursorIndexOfFullPhone);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpPhotoUri;
            if (_cursor.isNull(_cursorIndexOfPhotoUri)) {
              _tmpPhotoUri = null;
            } else {
              _tmpPhotoUri = _cursor.getString(_cursorIndexOfPhotoUri);
            }
            _item = new PhoneContactTable(_tmpName,_tmpFullPhone,_tmpPhotoUri);
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

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
