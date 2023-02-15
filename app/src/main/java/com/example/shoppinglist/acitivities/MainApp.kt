package com.example.shoppinglist.acitivities

import android.app.Application
import com.example.shoppinglist.db.MainDataBase

class MainApp: Application() {

    val database by lazy { MainDataBase.getDatabase(this) }
}