package com.example.sandra.quemepongo.actividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.sandra.quemepongo.data.PhoneData;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 */
public class ClimaActivity extends AppCompatActivity {

    private static String base_url = "http://api.openweathermap.org/data/2.5/weather?q=";
    private static String key_api = "&APPID=83ab580fe33631641111971b6488e1cd";
    private static String error_ciudad = "Ingrese una ciudad valida!";
    private TextView cartel_ciudad;
    private EditText ciudad_ingresada;
    private Button boton_siguiente;
    private CheckBox check_ciudad;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.sandra.quemepongo.R.layout.activity_clima);
        this.startUp();
    }

    /**
     *
     */
    private void startUp(){
        cartel_ciudad = (TextView) findViewById(com.example.sandra.quemepongo.R.id.ciudad_text);
        ciudad_ingresada = (EditText) findViewById(com.example.sandra.quemepongo.R.id.ingreso_ciudad);
        boton_siguiente = (Button) findViewById(com.example.sandra.quemepongo.R.id.boton_seguir_clima);
        check_ciudad = (CheckBox) findViewById(com.example.sandra.quemepongo.R.id.check_ciudad);
        boton_siguiente.setEnabled(false);
    }
    /**
     *
     * @param view
     */
    public void onCheck(View view){
        String city = ciudad_ingresada.getText().toString();
        final String URL = base_url+city+key_api;
        JsonObjectRequest req = new JsonObjectRequest(Request.Method.GET,URL, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            JSONObject main_object = response.getJSONObject("main"); //unico objeto que me interesa
                            PhoneData aux = PhoneData.getData();

                            aux.setTempAct(main_object.getDouble("temp"));
                            aux.setTempMax(main_object.getDouble("temp_max"));
                            aux.setTempMin(main_object.getDouble("temp_min"));
                            aux.setCiudad(response.getString("name"));
                            aux.setHumedad(main_object.getInt("humidity"));
                            cartel_ciudad.setText("");
                            boton_siguiente.setEnabled(true);
                            check_ciudad.setChecked(false);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                check_ciudad.setChecked(false);
                cartel_ciudad.setText(error_ciudad);
                /**Caso que ingresen una ciudad invalida luego de haber ingresado una valida*/
                boton_siguiente.setEnabled(false);
            }
        });
        RequestQueue queue = Volley.newRequestQueue(this);
        queue.add(req);
    }

    /**
     *
     * @param view
     */
    public void nextActivity(View view){
        Intent intent = new Intent(this, ResultadosActivity.class);
        startActivity(intent);
    }
}