package com.guzzler.bdroom.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.guzzler.bdroom.model.repository.EmployeRepository

class EmployeViewModelFactory(private val employeRepository: EmployeRepository) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(EmployeViewModel::class.java))
            return EmployeViewModel(employeRepository) as T

        throw IllegalArgumentException("Classe ViewModel inconnue")
    }


}