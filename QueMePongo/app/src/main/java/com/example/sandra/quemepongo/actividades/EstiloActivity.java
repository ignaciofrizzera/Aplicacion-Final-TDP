package com.example.sandra.quemepongo.actividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.example.sandra.quemepongo.actividades.ClimaActivity;
import com.example.sandra.quemepongo.data.PhoneData;

/**
 * Clase/Actividad encargada de capturar el estilo de vestir del usuario.
 */
public class EstiloActivity extends AppCompatActivity {

    private CheckBox check_casual;
    private CheckBox check_formal;
    private Button siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.sandra.quemepongo.R.layout.activity_estilo);

        this.startUp();
    }

    /**
     * Inicializa la actividad y sus elementos.
     */
    private void startUp(){
        check_casual = (CheckBox)findViewById(com.example.sandra.quemepongo.R.id.boton_casual);
        check_formal = (CheckBox)findViewById(com.example.sandra.quemepongo.R.id.boton_formal);
        siguiente = (Button)findViewById(com.example.sandra.quemepongo.R.id.boton_seguir_estilo);
        siguiente.setEnabled(false);
    }

    /**
     * Listener de los checkbox.
     * Se encarga de capturar la opcion elegida por el usuario respecto al estilo de vestir.
     * @param view
     */
    public void onCheckBoxClicked(View view){
        if(check_formal.isChecked()) {
            check_casual.setEnabled(false);
            PhoneData.getData().setFormal(true);
            siguiente.setEnabled(true);
        }
        else {
            if (check_casual.isChecked()) {
                check_formal.setEnabled(false);
                PhoneData.getData().setFormal(false);
                siguiente.setEnabled(true);
            }
            else{
                check_casual.setEnabled(true);
                check_formal.setEnabled(true);
                siguiente.setEnabled(false);
            }
        }
    }

    /**
     * Listener del boton para avanzar de actividad.
     * @param view
     */
    public void nextActivity(View view){
        Intent intent = new Intent(this,ClimaActivity.class);
        startActivity(intent);
    }
}
