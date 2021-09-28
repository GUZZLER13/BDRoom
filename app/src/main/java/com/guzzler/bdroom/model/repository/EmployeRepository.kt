package com.guzzler.bdroom.model.repository

import com.guzzler.bdroom.model.dao.EmployeDao
import com.guzzler.bdroom.model.entity.Employe

class EmployeRepository(private val dao: EmployeDao) {
    suspend fun ajouterEmploye(employe: Employe): Long = dao.ajouterEmploye(employe)
    suspend fun modifierEmploye(employe: Employe): Int = dao.modifierEmploye(employe)
    suspend fun supprimerEmploye(employe: Employe): Int = dao.supprimerEmploye(employe)
    suspend fun supprimmerTout(): Int = dao.supprimerTout()

    val listeEmployes = dao.getEmployes()

}