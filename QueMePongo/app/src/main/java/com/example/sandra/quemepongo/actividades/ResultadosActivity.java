package com.example.sandra.quemepongo.actividades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.sandra.quemepongo.R;
import com.example.sandra.quemepongo.data.PhoneData;

public class ResultadosActivity extends AppCompatActivity {

    private TextView cartel_ciudad;
    private TextView cartel_temp;
    private TextView cartel_hum;
    private final PhoneData data = PhoneData.getData();
    private final String ciudad = data.getCiudad();
    private final String humedad = "Humedad: "+data.getHumedad()+"%";
    private final String temp = "Temperatura: "+data.getTempAct();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.sandra.quemepongo.R.layout.activity_resultados);

        this.startUp();
    }

    private void startUp(){
        cartel_ciudad = (TextView)findViewById(R.id.cartel_ciudad);
        cartel_temp = (TextView)findViewById(R.id.cartel_temp);
        cartel_hum = (TextView)findViewById(R.id.cartel_hum);

        cartel_ciudad.setText(ciudad);
        cartel_hum.setText(humedad);
        cartel_temp.setText(temp);
    }
}
