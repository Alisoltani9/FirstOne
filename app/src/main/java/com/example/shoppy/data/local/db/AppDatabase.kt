package com.example.shoppy.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.shoppy.data.local.dao.CartDao
import com.example.shoppy.data.local.dao.OrderDao
import com.example.shoppy.data.local.dao.ProductDao
import com.example.shoppy.data.local.entity.cartEntity
import com.example.shoppy.data.local.entity.orderEntity
import com.example.shoppy.data.local.entity.productEntity

@Database(
    entities = [cartEntity::class, orderEntity::class, productEntity::class],
    version = 1,
    exportSchema = false

)
abstract class AppDatabase: RoomDatabase()
{
    companion object{
        const val DATABASE_NAME = "app_database"
    }
    abstract fun cartDao(): CartDao
    abstract fun orderDao(): OrderDao
    abstract fun productDao(): ProductDao
}
