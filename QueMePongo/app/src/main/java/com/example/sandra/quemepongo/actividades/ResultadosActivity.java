package com.example.sandra.quemepongo.actividades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.example.sandra.quemepongo.R;
import com.example.sandra.quemepongo.data.PhoneData;
import com.example.sandra.quemepongo.prendas.Falda;
import com.example.sandra.quemepongo.prendas.Prenda;
import com.example.sandra.quemepongo.prendas.VestidoClasico;
import com.example.sandra.quemepongo.prendas.abrigos.Blazer;
import com.example.sandra.quemepongo.prendas.abrigos.Buzo;
import com.example.sandra.quemepongo.prendas.abrigos.Campera;
import com.example.sandra.quemepongo.prendas.abrigos.Chaleco;
import com.example.sandra.quemepongo.prendas.abrigos.OversizedSweater;
import com.example.sandra.quemepongo.prendas.abrigos.SobretodoPanio;
import com.example.sandra.quemepongo.prendas.abrigos.Sweater;
import com.example.sandra.quemepongo.prendas.abrigos.TapadoPanio;
import com.example.sandra.quemepongo.prendas.accesorios.Bufanda;
import com.example.sandra.quemepongo.prendas.accesorios.Paraguas;
import com.example.sandra.quemepongo.prendas.accesorios.PanueloSeda;
import com.example.sandra.quemepongo.prendas.calzados.Borcego;
import com.example.sandra.quemepongo.prendas.calzados.Bota;
import com.example.sandra.quemepongo.prendas.calzados.Chatas;
import com.example.sandra.quemepongo.prendas.calzados.Mocasin;
import com.example.sandra.quemepongo.prendas.calzados.Sandalia;
import com.example.sandra.quemepongo.prendas.calzados.Tacos;
import com.example.sandra.quemepongo.prendas.calzados.Zapatilla;
import com.example.sandra.quemepongo.prendas.camisas.BlusaSeda;
import com.example.sandra.quemepongo.prendas.camisas.CamisaCorta;
import com.example.sandra.quemepongo.prendas.camisas.CamisaLarga;
import com.example.sandra.quemepongo.prendas.pantalones.Babucha;
import com.example.sandra.quemepongo.prendas.pantalones.Chinos;
import com.example.sandra.quemepongo.prendas.pantalones.Jean;
import com.example.sandra.quemepongo.prendas.pantalones.PantalonVestir;
import com.example.sandra.quemepongo.prendas.pantalones.cortos.Bermudas;
import com.example.sandra.quemepongo.prendas.pantalones.cortos.Shorts;
import com.example.sandra.quemepongo.prendas.remeras.MangaCorta;
import com.example.sandra.quemepongo.prendas.remeras.MangaLarga;
import com.example.sandra.quemepongo.prendas.remeras.Musculosa;
import com.example.sandra.quemepongo.prendas.remeras.Termica;
import com.example.sandra.quemepongo.visitors.Visitor;
import com.example.sandra.quemepongo.visitors.VisitorScores;

import java.util.ArrayList;

import static com.example.sandra.quemepongo.prendas.Prenda.obligatorio;
import static com.example.sandra.quemepongo.prendas.Prenda.opcional;

/**
 * Clase/Actividad destinada a setear los puntajes de las prendas en base a los datos climáticos y mostrar
 * las prendas a usar por pantalla.
 */
public class ResultadosActivity extends AppCompatActivity {

    private TextView cartel_info,deberia_ropa,opcional_ropa;
    private final PhoneData data = PhoneData.getData();
    private final String ciudad = data.getCiudad()+" - ";
    private final String humedad = "Humedad: "+data.getHumedad()+"%";
    private final ArrayList<Prenda> lista_prendas = new ArrayList<Prenda>();
    private String msg_deberia;
    private String msg_opcional;
    private String temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.sandra.quemepongo.R.layout.activity_resultados);

        this.startUp();

        this.setScores();
    }

    /**
     * Inicializa los carteles con la temperatura, humedad y el nombre de la ciudad del usuario.
     */
    private void startUp(){
        cartel_info = findViewById(R.id.cartel_info);
        deberia_ropa = findViewById(R.id.deberia_ropa);
        opcional_ropa = findViewById(R.id.opcional_ropa);

        this.setTemp();
        String message = ciudad + temp + humedad;
        cartel_info.setText(message);
    }

    /**
     * Setea la temperatura a mostrar.
     * Este metodo se debe a que la API muestra misma tempmin y tempmax cuando una ciudad es pequeña
     * o no esta totalmente contemplada por esta.
     */
    private void setTemp(){
        double temp_min = data.getTempMin();
        double temp_max = data.getTempMax();
        double temp_act = data.getTempAct();

        String s_min = String.format("%.1f",temp_min);
        String s_max = String.format("%.1f",temp_max);
        String s_act = String.format("%.1f",temp_act);

        if(temp_min != temp_max){
            temp = "Temp. min: "+s_min+" Temp. max: "+s_max+"°C - ";
        }
        else{
            temp = "Temperatura: "+s_act+"°C - ";
        }
    }

    /**
     * Setea el puntaje de todas las prendas.
     * Y en base a los puntajes se van mostrando los nombres de las prendas por pantalla.
     */
    private void setScores(){
        Visitor visitor_scores = new VisitorScores();
        this.setUpList();
        for(Prenda e : lista_prendas) {
            e.accept(visitor_scores);

            if(e.getPuntaje() == obligatorio){
                msg_deberia = msg_deberia + e.getNombre() + ", ";
            }
            if(e.getPuntaje() == opcional){
                msg_opcional = msg_opcional + e.getNombre() + ", ";
            }
        }

        /*El substring comienza en 4 porque se esta almacenando un "null" que no puedo lograr eliminar.
         * Luego se cortan los ultimos 2 ya que son el espacio y la coma, y se reemplazan con un punto.
         * Esto se realiza para que el mensaje mostrado por pantalla finalice con un '.' y no una ','.
         */
        String msg_deberia_final = msg_deberia.substring(4,msg_deberia.length()-2)+'.';
        String msg_recomienda_final = msg_opcional.substring(4,msg_opcional.length()-2)+'.';

        deberia_ropa.setText(msg_deberia_final);
        opcional_ropa.setText(msg_recomienda_final);
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
        lista_prendas.add(new Zapatilla());
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
        lista_prendas.add(new Blazer());
        lista_prendas.add(new OversizedSweater());
        lista_prendas.add(new SobretodoPanio());
        lista_prendas.add(new TapadoPanio());
        lista_prendas.add(new PanueloSeda());
        lista_prendas.add(new BlusaSeda());
        lista_prendas.add(new Chinos());
        lista_prendas.add(new PantalonVestir());
        lista_prendas.add(new Falda());
        lista_prendas.add(new VestidoClasico());
    }
}
