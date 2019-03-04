package com.example.sandra.quemepongo.actividades;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.blogspot.atifsoftwares.animatoolib.Animatoo;

/**
 * Clase/Actividad principal. Primer pantalla de la aplicacion.
 * Se encarga de mostrar el menú donde se puede comenzar la ejecución de la aplicación en si
 * o se puede ver la información personal mía y los datos de la universidad.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.sandra.quemepongo.R.layout.activity_main);

    }
    /**
     * Listener para iniciar el flujo de la aplicación.
     * @param view
     */
    public void nextActivity(View view){
        Intent intent = new Intent(this, GeneroActivity.class);
        /**Verifica que la versión del dispositivo cumpla los requisitos mínimos para soportar las animaciones
         * En caso contrario se avanza de actividad sin un efecto de animación.
         * */
        if (Build.VERSION.SDK_INT > 16) {
            startActivity(intent);
            Animatoo.animateZoom(this);
        } else {
            startActivity(intent);
        }
    }

    /**
     * Listener para mostrar la información personal.
     * @param view
     */
    public void showInfo(View view){
        Intent intent = new Intent(this,InfoActivity.class);
        /**Verifica que la versión del dispositivo cumpla los requisitos mínimos para soportar las animaciones
         * En caso contrario se avanza de actividad sin un efecto de animación.
         * */
        if (Build.VERSION.SDK_INT > 16){
            startActivity(intent);
            Animatoo.animateZoom(this);
        } else {
            startActivity(intent);
        }
    }

}
