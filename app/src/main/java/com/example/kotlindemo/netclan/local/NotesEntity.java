package com.example.kotlindemo.netclan.local;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "notes_table")
public class NotesEntity {

    @PrimaryKey(autoGenerate = true)
    private int local_id;
    @ColumnInfo(name = "userId")
    private String userId;
    @ColumnInfo(name = "description")
    private String description;
    @ColumnInfo(name ="date")
    private String date;
    @ColumnInfo(name = "createNoteFlag")
    private int createNoteFlag;
    @ColumnInfo(name = "updateNoteFlag")
    private int updateNoteFlag ;
    @ColumnInfo(name = "deleteNoteFlag")
    private int deleteNoteFlag;
    @ColumnInfo(name = "server_id")
    private String server_id;
    @ColumnInfo(name = "title")
    private String title;

    public int getLocal_id() {
        return local_id;
    }

    public void setLocal_id(int local_id) {
        this.local_id = local_id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCreateNoteFlag() {
        return createNoteFlag;
    }

    public void setCreateNoteFlag(int createNoteFlag) {
        this.createNoteFlag = createNoteFlag;
    }

    public int getUpdateNoteFlag() {
        return updateNoteFlag;
    }

    public void setUpdateNoteFlag(int updateNoteFlag) {
        this.updateNoteFlag = updateNoteFlag;
    }

    public int getDeleteNoteFlag() {
        return deleteNoteFlag;
    }

    public void setDeleteNoteFlag(int deleteNoteFlag) {
        this.deleteNoteFlag = deleteNoteFlag;
    }

    public String getServer_id() {
        return server_id;
    }

    public void setServer_id(String server_id) {
        this.server_id = server_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
