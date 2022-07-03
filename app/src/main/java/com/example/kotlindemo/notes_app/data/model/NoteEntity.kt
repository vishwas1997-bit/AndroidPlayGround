package com.example.kotlindemo.notes_app.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes_table")
data class NoteEntity(
    @PrimaryKey(autoGenerate = true)
    var local_id: Int,
    @ColumnInfo(name = "userId")
    val userId: String? = null,
    @ColumnInfo(name = "description")
    val description: String? = null,
    @ColumnInfo(name = "date")
    val date: String? = null,
    @ColumnInfo(name = "title")
    private val title: String? = null
)
