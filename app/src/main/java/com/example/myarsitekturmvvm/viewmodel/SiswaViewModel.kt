package com.example.myarsitekturmvvm.viewmodel

import androidx.lifecycle.ViewModel
import com.example.myarsitekturmvvm.model.Siswa
import kotlinx.coroutines.flow.MutableStateFlow

class SiswaViewModel : ViewModel(){
    private val  _statusUI = MutableStateFlow(Siswa())

}