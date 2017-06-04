package com.pabloangelveliz.ejemplos.kotlin.nullsenkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.pabloangelveliz.ejemplos.kotlin.nullsenkotlin.Classes.Alumno

class TestNullsEnKotlin : AppCompatActivity() {

    /*

    Cuando declaramos la variable, la inicialización es mandatoria y noten que al final
    del tipo de dato estoy incluyendo un signo de interrogación "?". Este signo lo que
    le dice a Kotlin es: "Ok, esta variable podría tener valores nulos".

     */

    var parametro: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_nulls_en_kotlin)

        parametro = intent.getStringExtra("parametro")

    }

    fun clicBotonProbarNullEnKotlin(v : View) {

        /*

        Si quisiéramos usar el "lenght" aquí al igual lo hicimos en Java, estaríamos en problemas
        y Kotlin nos lo avisaría de entrada ya que más arriba declaramos que "parametro" es una
        variable que podría tener nulos.

        CONSIGNA: Para probar, cambien la condición del if por la siguiente:

        if( parametro.length > 0 )

        Y vean el error y la sugerencia que Android Studio les da.

        */

        if( ! parametro.isNullOrEmpty() ) {

            Toast.makeText(this, "Valor Recibido: " + parametro, Toast.LENGTH_LONG).show()
        } else {

            Toast.makeText(this, "No Hay Valor Recibido: " + parametro, Toast.LENGTH_LONG).show()
        }

    }

    fun clicBotonProbarClaseKotlin(v: View) {

        // Variables Inmutables SIN Declaración de Tipo:
        val pepe = "Algo"
        val numero = 22

        // Variables Inmutables CON Declaración de Tipo:
        val otroPepe : String = "Algo"
        val otroNumero : Int = 22

        // Variables mutables
        var pais = "Argentina"
        var otroPais : String = "Argentina"


        val nuevoAlumno = Alumno (1212, "Pepe Nombre", "Pepe Apellido")

        Toast.makeText(this, "Clase Pepe: " + nuevoAlumno.nombre, Toast.LENGTH_LONG).show()
        Toast.makeText(this, "Calcular Suma: " + nuevoAlumno.calcularSuma(1,3), Toast.LENGTH_LONG).show()

    }
}
