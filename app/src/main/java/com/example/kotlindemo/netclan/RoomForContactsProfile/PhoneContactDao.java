package com.example.kotlindemo.netclan.RoomForContactsProfile;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Transaction;

import com.example.kotlindemo.netclan.response_model.PhoneContactTable;

import java.util.List;

@Dao
 public abstract class PhoneContactDao {

    @Query("select * from find_contact_response order by firstName")
    public abstract LiveData<List<FindContactResponse>> getInviteUserLiveData();

    @Query("select * from find_contact_response order by firstName")
    public abstract List<FindContactResponse> getInviteUser();

    @Query("select fullPhone from phone_contact_table")
    public abstract List<String> getAllPhoneContacts();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public abstract void insert(FindContactResponse inviteEntity);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public abstract void insertAllPhoneContact(List<PhoneContactTable> list);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public abstract void insertAllInviteUser(List<FindContactResponse> list);

    @Query("select phone_contact_table.* from phone_contact_table where fullPhone not in (select fullPhone from find_contact_response union select fullPhone from connection_table union select fullPhone from contacts_table)")
    public abstract LiveData<List<PhoneContactTable>> getPhoneContact();

    @Query("DELETE FROM phone_contact_table")
    public abstract void clearPhoneContactTable();

    @Query("DELETE FROM find_contact_response")
    public abstract void clearFindContactTable();

    @Query("DELETE FROM find_contact_response where _id =:userId")
    public abstract void deleteUserFromFindContactTable(@NonNull String userId);

    @Query("UPDATE find_contact_response SET invStatus = :invStatus where _id = :userId")
    public abstract void updateInvStatus(@NonNull String userId, @NonNull int invStatus);

    @Transaction
    public void deleteAndInsertInviteUserList(List<FindContactResponse> list){
        clearFindContactTable();
        insertAllInviteUser(list);
    }

   @Transaction
   public void deleteAndInsertPhoneContactList(List<PhoneContactTable> list){
      clearPhoneContactTable();
      insertAllPhoneContact(list);
   }
}
