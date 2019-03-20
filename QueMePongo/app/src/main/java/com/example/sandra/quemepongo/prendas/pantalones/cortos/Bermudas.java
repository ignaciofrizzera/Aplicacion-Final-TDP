package com.example.sandra.quemepongo.prendas.pantalones.cortos;

import com.example.sandra.quemepongo.prendas.pantalones.Pantalon;
import com.example.sandra.quemepongo.visitors.Visitor;


/**
 * Clase destinada a representar el pantalón corto tipo bermuda.
 */
public class Bermudas extends Pantalon {

    public Bermudas(){
        this.nombre = "Bermudas";
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public void setPuntaje(double max, int humedad, boolean es_mujer, boolean es_formal) {
        if(!es_mujer && !es_formal){
            if (max > 20){
                this.puntaje = opcional;
            }
            if (max >= 25) {
                this.puntaje = obligatorio;
            }
        }
    }
}
