package com.example.sandra.quemepongo.prendas.abrigos;

import com.example.sandra.quemepongo.visitors.Visitor;

/**
 * Clase destinada a la representacion de una campera.
 */
public class Campera extends Abrigo{

    public Campera(){
        this.nombre = "Campera";
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public void setPuntaje(double max, int humedad, boolean es_mujer, boolean es_formal) {
        if(!es_formal) {
            if (max <= 15) {
                this.puntaje = opcional;
            }
            if (max <= 10) {
                this.puntaje = obligatorio;
            }
            if (humedad > 90) {
                this.puntaje = opcional;
            }
        }
    }
}
