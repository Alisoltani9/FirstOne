package com.example.shoppy.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.shoppy.data.local.entity.productEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface ProductDao {

    @Query("SELECT * FROM productEntity")
    fun getAllProducts(): Flow<List<productEntity>>

    @Query("SELECT * FROM productEntity WHERE id = :id")
    suspend fun getProductById(id: Int): productEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsertProduct(product: productEntity)

    @Delete
    suspend fun deleteProduct(product: productEntity)


}