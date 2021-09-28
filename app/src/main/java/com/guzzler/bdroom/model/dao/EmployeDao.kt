package com.guzzler.bdroom.model.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.guzzler.bdroom.model.entity.Employe

@Dao

interface EmployeDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun ajouterEmploye(employe: Employe): Long

    @Update
    suspend fun modifierEmploye(employe: Employe): Int

    @Delete
    suspend fun supprimerEmploye(employe: Employe): Int

    @Query("DELETE FROM table_employe")
    suspend fun supprimerTout(): Int


    // pas besoin de coroutine
    @Query("SELECT * FROM table_employe")
    fun getEmployes(): LiveData<List<Employe>>
}