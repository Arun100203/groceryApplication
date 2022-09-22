package com.example.groceryapplication

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface GroceryDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item: GroceryItems)

    @Delete
    suspend fun delete(item: GroceryItems)

    @Query("SELECT * FROM grocerry_items")
    fun getAllGroceryItems(): LiveData<List<GroceryItems>>
}







