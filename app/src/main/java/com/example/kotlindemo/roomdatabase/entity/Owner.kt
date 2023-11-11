package com.example.kotlindemo.roomdatabase.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity
data class Owner(
    @PrimaryKey val ownerId: Long, val name: String
)
