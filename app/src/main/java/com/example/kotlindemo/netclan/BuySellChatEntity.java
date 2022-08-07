package com.example.kotlindemo.netclan;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "buy_sell_chat_table")
public class BuySellChatEntity {

    @PrimaryKey
    @ColumnInfo(name = "_id")
    @NonNull
    private String id;

    @ColumnInfo(name = "inChatDataBase")
    private boolean inChatDataBase;

    public BuySellChatEntity(String id, boolean inChatDataBase) {
        this.id = id;
        this.inChatDataBase = inChatDataBase;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isInChatDataBase() {
        return inChatDataBase;
    }

    public void setInChatDataBase(boolean inChatDataBase) {
        this.inChatDataBase = inChatDataBase;
    }
}