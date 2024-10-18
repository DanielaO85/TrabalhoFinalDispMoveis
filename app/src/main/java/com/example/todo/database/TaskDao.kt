package com.example.todo.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update


@Dao
interface TaskDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(task: TaskEntity)

    @Update
    suspend fun update(task: TaskEntity)

    @Delete
    suspend fun delete(task: TaskEntity)

    @Query("SELECT * FROM tasks")
    fun getAllTasks(): LiveData<List<TaskEntity>>

    @Query("SELECT * FROM tasks WHERE dueDate BETWEEN :startDate AND :endDate")
    fun getTasksByDateRange(startDate: Long, endDate: Long): List<TaskEntity>

    @Query("SELECT * FROM tasks WHERE isCompleted = :status")
    fun getTasksByStatus(status: Boolean): List<TaskEntity>

//    @Query("SELECT * FROM tasks WHERE categoryId = :categoryId")
//    fun getTasksByCategory(categoryId: Long): List<TaskEntity>
}


