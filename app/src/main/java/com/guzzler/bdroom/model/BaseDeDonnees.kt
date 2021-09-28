package com.guzzler.bdroom.model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.guzzler.bdroom.model.dao.EmployeDao

@Database(entities = [EmployeDao::class], version = 1)
abstract class BaseDeDonnees : RoomDatabase() {
    abstract val employeDao: EmployeDao


    //une seule instance de la base de donnée !
    companion object {
        @Volatile
        private var INSTANCE: BaseDeDonnees? = null

        fun getInstance(context: Context): BaseDeDonnees {
            synchronized(this) {
                var instance: BaseDeDonnees? = INSTANCE
                if (instance == null) {
                    instance =
                        Room.databaseBuilder(context, BaseDeDonnees::class.java, "BDEmployes")
                            .build()
                }
                return instance
            }
        }
    }
}