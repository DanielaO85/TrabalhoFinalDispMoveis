package com.example.todo

import androidx.room.Entity
import androidx.room.PrimaryKey

class CategoryEntity {
    @Entity(tableName = "categories")
    data class CategoryEntity(
        @PrimaryKey(autoGenerate = true) val id: Long = 0,
        val name: String
    )
}