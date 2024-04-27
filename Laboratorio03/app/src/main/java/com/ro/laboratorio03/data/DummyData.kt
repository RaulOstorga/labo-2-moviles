package com.ro.laboratorio03.data

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.ro.laboratorio03.model.ObjectClass

val objectList:MutableState<MutableList<ObjectClass>> = mutableStateOf(mutableListOf())