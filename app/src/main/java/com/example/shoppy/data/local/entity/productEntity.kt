package com.example.shoppy.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class productEntity(
    @PrimaryKey val id: Int,
    val name: String,
    val description: String,
    val price: Double,
    val imageUrl: String,
    val category: String,
    val stockQuantity: Int
)
