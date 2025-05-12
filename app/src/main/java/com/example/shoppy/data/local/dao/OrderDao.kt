package com.example.shoppy.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.shoppy.data.local.entity.orderEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface OrderDao {

    @Query("SELECT * FROM orderEntity ORDER BY orderDate DESC")
    fun getAllOrders(): Flow<List<orderEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrder(order: orderEntity)

    @Query("SELECT * FROM orderEntity WHERE id = :orderId")
    suspend fun getOrderById(orderId: Int): orderEntity?
}