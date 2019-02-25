package com.example.sandra.quemepongo.actividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * Clase/Actividad principal. Primer pantalla de la aplicacion.
 */
public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.sandra.quemepongo.R.layout.activity_main);

    }
    /**
     * Listener para iniciar el flujo de la aplicacion.
     * @param view
     */
    public void sendMessage(View view){
        Intent intent = new Intent(this, GeneroActivity.class);
        startActivity(intent);
    }

    public void showInfo(View view){
        Intent intent = new Intent(this,InfoActivity.class);
        startActivity(intent);
    }

}
