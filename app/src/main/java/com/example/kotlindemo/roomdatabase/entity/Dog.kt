package com.example.kotlindemo.roomdatabase.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Dog(
    @PrimaryKey val dogId: Long,
    val dogOwnerId: Long,
    val name: String,
)
