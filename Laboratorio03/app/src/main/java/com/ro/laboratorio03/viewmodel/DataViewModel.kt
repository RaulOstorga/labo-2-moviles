package com.ro.laboratorio03.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import com.ro.laboratorio03.model.ObjectClass
import com.ro.laboratorio03.data.objectList

class DataViewModel: ViewModel() {

    fun setData(myList: MutableList<ObjectClass>){
        viewModelScope.launch {
            objectList.value = myList
        }
    }

    fun getData(): MutableList<ObjectClass>{
        return objectList.value
    }
}