package com.example.tutorialseu_arraylists

class Dog (val name: String, val breed: String, var age: Int = 0){

    init {
        bark(name)
    }
    fun bark(name: String){
        println("$name says Woof Woof")
    }
}