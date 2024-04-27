package com.ro.laboratorio03.model

data class ObjectClass(
    private var propertyOne: String,
    private var propertyTwo: String,
) {

    fun getPropertyOne(): String {
        return propertyOne
    }

    fun getPropertyTwo():String{
        return propertyTwo
    }

}
/*TODO: Hace ruso de buenas praticas de POO para poder asignar o obtener valores de las properties a utilizar*/
