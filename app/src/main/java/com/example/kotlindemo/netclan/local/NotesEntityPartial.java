package com.example.kotlindemo.netclan.local;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class NotesEntityPartial {

    @PrimaryKey
    private int local_id;

    @ColumnInfo(name = "createNoteFlag")
    private int createNoteFlag;

    @ColumnInfo(name = "server_id")
    private String server_id;

    public NotesEntityPartial(int local_id, int createNoteFlag, String server_id) {
        this.local_id = local_id;
        this.createNoteFlag = createNoteFlag;
        this.server_id = server_id;
    }

    public int getLocal_id() {
        return local_id;
    }

    public void setLocal_id(int local_id) {
        this.local_id = local_id;
    }

    public int getCreateNoteFlag() {
        return createNoteFlag;
    }

    public void setCreateNoteFlag(int createNoteFlag) {
        this.createNoteFlag = createNoteFlag;
    }

    public String getServer_id() {
        return server_id;
    }

    public void setServer_id(String server_id) {
        this.server_id = server_id;
    }
}
