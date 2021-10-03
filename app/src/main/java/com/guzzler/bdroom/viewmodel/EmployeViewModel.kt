package com.guzzler.bdroom.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.guzzler.bdroom.model.entity.Employe
import com.guzzler.bdroom.model.repository.EmployeRepository
import kotlinx.coroutines.launch

class EmployeViewModel(private val employeRepository: EmployeRepository) : ViewModel() {

    val employes = employeRepository.listeEmployes

    fun ajouterEmploy(employe: Employe) =
        viewModelScope.launch {
            val idNouveauEmploye: Long = employeRepository.ajouterEmploye(employe)

        }

    fun modifierEmploye(employe: Employe) = viewModelScope.launch {
        val nombreLignes = employeRepository.modifierEmploye(employe)
    }

    fun supprimerEmploye(employe: Employe) = viewModelScope.launch {
        val nombresLignes = employeRepository.supprimerEmploye(employe)
    }

    fun supprimerTout() = viewModelScope.launch {
        val nombreLigne = employeRepository.supprimmerTout()
    }

}



