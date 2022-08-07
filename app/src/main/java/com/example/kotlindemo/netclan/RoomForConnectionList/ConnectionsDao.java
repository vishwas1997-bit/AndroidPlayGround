package com.example.kotlindemo.netclan.RoomForConnectionList;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;


import com.example.kotlindemo.netclan.response_model.GetGeneralProfile;

import java.util.List;

@Dao
public interface ConnectionsDao {


    @Query("select profile.* from profile inner join connection_table on profile._id = connection_table._id where inConnectionDataBase = 1 order by firstName")
    LiveData<List<GetGeneralProfile>> getConnections();

    @Query("select profile.* from profile inner join connection_table on profile._id = connection_table._id where inConnectionDataBase = 1")
    List<GetGeneralProfile> getConnectionsList();

    @Query("select profile.* from profile inner join connection_table on profile._id = connection_table._id where inConnectionDataBase = 1 and userType_ = 0 union select profile.* from profile inner join buy_sell_chat_table on profile._id = buy_sell_chat_table._id where inChatDataBase = 1 and userType_ = 0 union select profile.* from profile inner join contacts_table on profile._id = contacts_table._id where inContactsDataBase = 1 and userType_ = 0")
    LiveData<List<GetGeneralProfile>> getConnectionsIndividual();

    @Query("select profile.* from profile inner join connection_table on profile._id = connection_table._id where inConnectionDataBase = 1 and userType_ = 0 union select profile.* from profile inner join buy_sell_chat_table on profile._id = buy_sell_chat_table._id where inChatDataBase = 1 and userType_ = 0 union select profile.* from profile inner join contacts_table on profile._id = contacts_table._id where inContactsDataBase = 1 and userType_ = 0")
    List<GetGeneralProfile> getConnectionsListIndividual();

    @Query("select profile.* from profile inner join connection_table on profile._id = connection_table._id where inConnectionDataBase = 1 and userType_ = 1 union select profile.* from profile inner join contacts_table on profile._id = contacts_table._id where inContactsDataBase = 1 and userType_ = 1")
    LiveData<List<GetGeneralProfile>> getConnectionsProfessional();

    @Query("select profile.* from profile inner join connection_table on profile._id = connection_table._id where inConnectionDataBase = 1 and userType_ = 1 union select profile.* from profile inner join contacts_table on profile._id = contacts_table._id where inContactsDataBase = 1 and userType_ = 1")
    List<GetGeneralProfile> getConnectionsListProfessional();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(GetGeneralProfile connectionsEntity);

}
