package com.example.kotlindemo.netclan.local;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class NotesPartialEntityForDelete {

    @PrimaryKey
    private int local_id;

    @ColumnInfo(name = "deleteNoteFlag")
    private int deleteNoteFlag;

    public int getLocal_id() {
        return local_id;
    }

    public void setLocal_id(int local_id) {
        this.local_id = local_id;
    }

    public int getDeleteNoteFlag() {
        return deleteNoteFlag;
    }

    public void setDeleteNoteFlag(int deleteNoteFlag) {
        this.deleteNoteFlag = deleteNoteFlag;
    }
}
