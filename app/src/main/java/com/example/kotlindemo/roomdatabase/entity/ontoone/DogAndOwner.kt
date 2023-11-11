package com.example.kotlindemo.roomdatabase.entity.ontoone

import androidx.room.Embedded
import androidx.room.Relation
import com.example.kotlindemo.roomdatabase.entity.Dog
import com.example.kotlindemo.roomdatabase.entity.Owner

data class DogAndOwner(
    @Embedded val owner: Owner,
    @Relation(
        parentColumn = "ownerId",
        entityColumn = "dogOwnerId"
    )
    val dog: Dog
)