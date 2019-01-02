package com.example.sandra.quemepongo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

/**
 * Clase/Actividad encargada de capturar el estilo de vestir del usuario.
 */
public class EstiloActivity extends AppCompatActivity {

    private CheckBox check_casual;
    private CheckBox check_formal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estilo);

        this.startUp();
    }

    /**
     * Inicializa los checkbox de la actividad.
     */
    private void startUp(){
        check_casual = (CheckBox)findViewById(R.id.boton_casual);
        check_formal = (CheckBox)findViewById(R.id.boton_formal);
    }

    /**
     * Listener de los checkbox.
     * Se encarga de capturar la opcion elegida por el usuario respecto al estilo de vestir.
     * @param view
     */
    public void onCheckBoxClicked(View view){
        if(check_formal.isChecked()) {
            check_casual.setEnabled(false);
            PhoneData.getData().setEstilo(check_formal.getText().toString());
        }
        else {
            if (check_casual.isChecked()) {
                check_formal.setEnabled(false);
                PhoneData.getData().setEstilo(check_casual.getText().toString());
            }
            else{
                check_casual.setEnabled(true);
                check_formal.setEnabled(true);
            }
        }
    }

    /**
     * Listener del boton para avanzar de actividad.
     * @param view
     */
    public void nextActivity(View view){
        Intent intent = new Intent(this,ResultadosActivity.class);
        startActivity(intent);
    }
}
