package com.example.shoppy.data.local.dao

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.shoppy.data.local.entity.cartEntity
import kotlinx.coroutines.flow.Flow

interface CartDao {

    @Query("SELECT * FROM cart")
    fun getCartItems(): Flow<List<cartEntity>>

    @Query("SELECT * FROM cart WHERE productId = :productId LIMIT 1")
    suspend fun getCartItemByProductId(productId: Int): cartEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCartItem(item: cartEntity)

    @Update
    suspend fun updateCartItem(item: cartEntity)

    @Delete
    suspend fun deleteCartItem(item: cartEntity)

    @Query("DELETE FROM cart")
    suspend fun clearCart()
}