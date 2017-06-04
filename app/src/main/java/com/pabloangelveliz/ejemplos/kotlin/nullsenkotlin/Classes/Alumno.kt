package com.pabloangelveliz.ejemplos.kotlin.nullsenkotlin.Classes


open class Alumno constructor (
        var documento: Int,
        var nombre: String,
        var apellido: String
) {
    init {

    }

    fun calcularSuma ( a: Int, b: Int = 0 ) : Int {
        return a + b
    }

}

class Pablo () : Alumno(1212, "Pablo", "Veliz")
