package com.example.shoppy.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class orderEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val orderDate: Long,
    val totalAmount: Double,
    val items: String // JSON string or serialized list of product/qty
)
