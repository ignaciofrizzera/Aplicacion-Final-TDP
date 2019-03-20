package com.example.sandra.quemepongo.prendas.calzados;

import com.example.sandra.quemepongo.visitors.Visitor;


/**
 * Clase destinada a representar borcegos.
 */
public class Borcego extends Calzado {

    public Borcego(){
        this.nombre = "Borcegos";
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public void setPuntaje(double max, int humedad, boolean es_mujer, boolean es_formal) {
        if(!es_mujer && !es_formal){
            if(max < 15){
                this.puntaje = opcional;
            }
            if(max < 10){
                this.puntaje = obligatorio;
            }
        }
    }
}
