package com.example.sandra.quemepongo.prendas.pantalones;

import com.example.sandra.quemepongo.visitors.Visitor;


/**
 * Clase destinada a representar el pantalón tipo babucha.
 */
public class Babucha extends Pantalon {

    public Babucha(){
        this.nombre = "Babucha";
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public void setPuntaje(double max, int humedad, boolean es_mujer, boolean es_formal) {
        if(!es_formal){
            if(max < 25){
                this.puntaje = opcional;
            }
            if(max < 20){
                this.puntaje = obligatorio;
            }
        }
    }
}
