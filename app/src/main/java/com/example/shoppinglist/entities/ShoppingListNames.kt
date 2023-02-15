package com.example.shoppinglist.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "shopping_list_names")
data class ShoppingListNames(
    @PrimaryKey(autoGenerate = true)
    val id: Int?,

    @ColumnInfo(name = "name")
    val name: String,

    @ColumnInfo(name = "time")
    val time: Int,

    @ColumnInfo(name = "allItemCounter")
    val allItemCounter: String,

    @ColumnInfo(name = "checkedItemsCounter")
    val checkedItemsCounter: Int,

    @ColumnInfo(name = "itemsAds")
    val itemsAds: String

): java.io.Serializable
