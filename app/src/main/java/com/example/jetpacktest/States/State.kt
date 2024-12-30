package com.example.jetpacktest.States

import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel


class StateViewModel: ViewModel() {
    private val _name= mutableStateOf("Tikku")
    private val _age= mutableStateOf(25)

    var name=_name
    var age=_age

    fun updateName(newName: String){
        _name.value=newName
        name=_name
    }

    fun updateAge(newAge: Int){
        _age.value=newAge
        age=_age
    }

    fun incAge(){
        _age.value+=1
        age=_age
    }
}