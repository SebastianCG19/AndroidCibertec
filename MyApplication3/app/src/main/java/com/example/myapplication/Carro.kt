package com.example.myapplication

class Carro(val llantas:Int , val Modelo:String, var antigue:Int) {
constructor(llantas: Int,antigue: Int,Modelo: String):this(llantas,Modelo,antigue)


    fun agregarAnios(){
        antigue++
    }




}