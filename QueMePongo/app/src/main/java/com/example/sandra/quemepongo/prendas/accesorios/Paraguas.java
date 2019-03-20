package com.example.sandra.quemepongo.prendas.accesorios;

import com.example.sandra.quemepongo.visitors.Visitor;


/**
 * Clase destinada a la representacion de un paraguas.
 */
public class Paraguas extends Accesorios {

    public Paraguas(){
        this.nombre = "Paraguas";
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public void setPuntaje(double max, int humedad, boolean es_mujer, boolean es_formal) {
        if(humedad >= 90){
            this.puntaje = obligatorio;
        }
        else {
            if (humedad < 90 && humedad > 75) {
                this.puntaje = opcional;
            }
        }
    }
}
