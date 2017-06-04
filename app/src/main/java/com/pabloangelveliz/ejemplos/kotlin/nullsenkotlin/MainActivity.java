
package com.pabloangelveliz.ejemplos.kotlin.nullsenkotlin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String parametro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        parametro = getIntent().getStringExtra("valor");
    }

    public void clicBtnMostrarNull( View v) {

        /*
        Cualquier operación que se realice con la variable "parametro" aquí,
        causará un NullPointerException debido a que no se puede garantizar
        que dicha variable tenga un valor.

        Recordar igual, que este ejemplo está un poco "forzado" con el fin de
        ejemplificar este tema.

         */

        try {
            if (parametro.length() > 0) {

                Toast.makeText(this, "Valor Recibido: " + parametro, Toast.LENGTH_LONG).show();
            } else {

                Toast.makeText(this, "No Hay Valor Recibido: " + parametro, Toast.LENGTH_LONG).show();
            }
        } catch (Exception e) {

            Toast.makeText(this, "PUM!: " + e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
        }
    }

    public void clicAbreVersionKotlin(View v) {
        Intent i = new Intent(this, TestNullsEnKotlin.class);
        startActivity(i);
    }
}
