package com.example.sandra.quemepongo;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

/**
 * Clase/Actividad encargada de capturar el genero del usuario.
 */
public class GeneroActivity extends AppCompatActivity {

    private CheckBox check_femenino;
    private CheckBox check_masculino;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genero);

        this.startUp();
    }

    /**
     * Inicializa los checkbox de la actividad.
     */
    private void startUp(){
        check_femenino = (CheckBox) findViewById(R.id.boton_femenino);
        check_masculino = (CheckBox) findViewById(R.id.boton_masculino);
    }

    /**
     * Listener de los checkbox.
     * Se encarga de capturar el genero que ingreso el usuario.
     * @param view
     */
    public void onCheckBoxClicked(View view){
        if(check_masculino.isChecked()) {
            check_femenino.setEnabled(false);
            PhoneData.getData().setGenero(check_masculino.getText().toString());
        }
        else {
            if (check_femenino.isChecked()) {
                check_masculino.setEnabled(false);
                PhoneData.getData().setGenero(check_femenino.getText().toString());
            }
            else{
                check_masculino.setEnabled(true);
                check_femenino.setEnabled(true);
            }
        }
    }

    /**
     * Listener del boton para avanzar de actividad.
     * @param view
     */
    public void nextActivity(View view){
        Intent intent = new Intent(this,EstiloActivity.class);
        startActivity(intent);
    }


}
