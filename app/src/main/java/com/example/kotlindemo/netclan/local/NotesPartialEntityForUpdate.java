package com.example.kotlindemo.netclan.local;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class NotesPartialEntityForUpdate {

    @PrimaryKey
    private int local_id;

    @ColumnInfo(name = "description")
    private String description;

    @ColumnInfo(name = "title")
    private String title;

    @ColumnInfo(name ="date")
    private String date;

    @ColumnInfo(name = "updateNoteFlag")
    private int updateNoteFlag;

    public int getLocal_id() {
        return local_id;
    }

    public void setLocal_id(int local_id) {
        this.local_id = local_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getUpdateNoteFlag() {
        return updateNoteFlag;
    }

    public void setUpdateNoteFlag(int updateNoteFlag) {
        this.updateNoteFlag = updateNoteFlag;
    }
}
