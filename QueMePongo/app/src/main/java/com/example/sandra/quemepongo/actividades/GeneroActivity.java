package com.example.sandra.quemepongo.actividades;


import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.example.sandra.quemepongo.data.PhoneData;

/**
 * Clase/Actividad encargada de capturar el género del usuario.
 */
public class GeneroActivity extends AppCompatActivity {

    private CheckBox check_femenino;
    private CheckBox check_masculino;
    private Button siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.sandra.quemepongo.R.layout.activity_genero);

        this.startUp();
    }

    /**
     * Inicializa la actividad y sus elementos.
     */
    private void startUp(){
        check_femenino = (CheckBox) findViewById(com.example.sandra.quemepongo.R.id.boton_femenino);
        check_masculino = (CheckBox) findViewById(com.example.sandra.quemepongo.R.id.boton_masculino);
        siguiente = (Button) findViewById(com.example.sandra.quemepongo.R.id.boton_seguir_genero);
    }

    /**
     * Listener de los checkbox.
     * Se encarga de capturar el género que ingresó el usuario.
     * @param view
     */
    public void onCheckBoxClicked(View view){
        if(check_masculino.isChecked()) {
            check_femenino.setEnabled(false);
            PhoneData.getData().setMujer(false);
            siguiente.setVisibility(View.VISIBLE);
        }
        else {
            if (check_femenino.isChecked()) {
                check_masculino.setEnabled(false);
                PhoneData.getData().setMujer(true);
                siguiente.setVisibility(View.VISIBLE);
            }
            else{
                check_masculino.setEnabled(true);
                check_femenino.setEnabled(true);
                siguiente.setVisibility(View.GONE);
            }
        }
    }

    /**
     * Listener del botón para avanzar de actividad.
     * @param view
     */
    public void nextActivity(View view){
        Intent intent = new Intent(this,EstiloActivity.class);
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


}
