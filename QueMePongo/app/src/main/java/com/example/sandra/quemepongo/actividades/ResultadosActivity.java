package com.example.sandra.quemepongo.actividades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.example.sandra.quemepongo.R;
import com.example.sandra.quemepongo.data.PhoneData;
import com.example.sandra.quemepongo.prendas.Prenda;
import com.example.sandra.quemepongo.prendas.abrigos.Buzo;
import com.example.sandra.quemepongo.prendas.abrigos.Campera;
import com.example.sandra.quemepongo.prendas.abrigos.Chaleco;
import com.example.sandra.quemepongo.prendas.abrigos.Sweater;
import com.example.sandra.quemepongo.prendas.accesorios.Bufanda;
import com.example.sandra.quemepongo.prendas.accesorios.Paraguas;
import com.example.sandra.quemepongo.prendas.calzados.Borcego;
import com.example.sandra.quemepongo.prendas.calzados.Bota;
import com.example.sandra.quemepongo.prendas.calzados.Chatas;
import com.example.sandra.quemepongo.prendas.calzados.Mocasin;
import com.example.sandra.quemepongo.prendas.calzados.Sandalia;
import com.example.sandra.quemepongo.prendas.calzados.Tacos;
import com.example.sandra.quemepongo.prendas.calzados.zapatillas.ZapatillaDeportiva;
import com.example.sandra.quemepongo.prendas.calzados.zapatillas.ZapatillaUrbana;
import com.example.sandra.quemepongo.prendas.camisas.CamisaCorta;
import com.example.sandra.quemepongo.prendas.camisas.CamisaLarga;
import com.example.sandra.quemepongo.prendas.pantalones.Babucha;
import com.example.sandra.quemepongo.prendas.pantalones.Jean;
import com.example.sandra.quemepongo.prendas.pantalones.cortos.Bermudas;
import com.example.sandra.quemepongo.prendas.pantalones.cortos.Shorts;
import com.example.sandra.quemepongo.prendas.remeras.MangaCorta;
import com.example.sandra.quemepongo.prendas.remeras.MangaLarga;
import com.example.sandra.quemepongo.prendas.remeras.Musculosa;
import com.example.sandra.quemepongo.prendas.remeras.Termica;
import com.example.sandra.quemepongo.visitors.Visitor;
import com.example.sandra.quemepongo.visitors.VisitorPrenda;

import java.util.ArrayList;


public class ResultadosActivity extends AppCompatActivity {

    private TextView cartel_info,cartel_usar,cartel_recomendar;
    private final PhoneData data = PhoneData.getData();
    private final String ciudad = data.getCiudad()+" - ";
    private final String humedad = "Humedad: "+data.getHumedad()+"%";
    private final ArrayList<Prenda> lista_prendas = new ArrayList<Prenda>();
    private String temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.sandra.quemepongo.R.layout.activity_resultados);

        this.startUp();

        this.setScores();

        this.displayClothes();
    }

    /**
     * Inicializa los carteles con la temperatura, humedad y el nombre de la ciudad del usuario.
     */
    private void startUp(){
        cartel_info = (TextView)findViewById(R.id.cartel_info);
        cartel_usar = (TextView)findViewById(R.id.cartel_usar);
        cartel_recomendar = (TextView)findViewById(R.id.cartel_recomendar);
        cartel_usar.setText("Se debería usar: ");
        cartel_recomendar.setText("Se recomienda usar: ");

        this.setTemp();
        String message = ciudad + temp + humedad;
        cartel_info.setText(message);
    }

    /**
     * Setea la temperatura a mostrar.
     * Este metodo se debe a que la API muestra misma tempmin y tempmax cuando una ciudad es pequeña.
     */
    private void setTemp(){
        double temp_min = data.getTempMin();
        double temp_max = data.getTempMax();

        if(temp_min != temp_max){
            temp = "Temp. min: "+temp_min+" Temp. max: "+temp_max+" - ";
        }
        else{
            temp = "Temperatura: "+data.getTempAct()+" - ";
        }
    }

    /**
     * Setea el puntaje de todas las prendas.
     */
    private void setScores(){
        Visitor visitor_prendas = new VisitorPrenda();
        this.setUpList();
        for(Prenda e : lista_prendas) {
            e.accept(visitor_prendas);
        }
    }

    /**
     * Inicializa la lista con todas las prendas.
     */
    private void setUpList(){
        lista_prendas.add(new Buzo());
        lista_prendas.add(new Campera());
        lista_prendas.add(new Chaleco());
        lista_prendas.add(new Sweater());
        lista_prendas.add(new Bufanda());
        lista_prendas.add(new Paraguas());
        lista_prendas.add(new ZapatillaUrbana());
        lista_prendas.add(new ZapatillaDeportiva());
        lista_prendas.add(new Borcego());
        lista_prendas.add(new Bota());
        lista_prendas.add(new Chatas());
        lista_prendas.add(new Mocasin());
        lista_prendas.add(new Sandalia());
        lista_prendas.add(new Tacos());
        lista_prendas.add(new CamisaLarga());
        lista_prendas.add(new CamisaCorta());
        lista_prendas.add(new Shorts());
        lista_prendas.add(new Bermudas());
        lista_prendas.add(new Babucha());
        lista_prendas.add(new Jean());
        lista_prendas.add(new MangaLarga());
        lista_prendas.add(new MangaCorta());
        lista_prendas.add(new Musculosa());
        lista_prendas.add(new Termica());
    }
    /**
     * Evalua el puntaje de las prendas y en base a este las muestra.
     */
    private void displayClothes(){
        /**Bad smell aca al comparar los puntajes? */
        for(Prenda p : lista_prendas){
            if(p.getPuntaje() == 10){
                cartel_usar.setText(cartel_usar.getText() + " " +p.getNombre());
            }
            if(p.getPuntaje() == 7.5){
                cartel_recomendar.setText(cartel_recomendar.getText() + " " +p.getNombre());
            }
        }
    }

}
