package com.example.sandra.quemepongo.prendas.calzados;

import com.example.sandra.quemepongo.visitors.Visitor;


/**
 * Clase destinada a representar tacos.
 */
public class Tacos extends Calzado {

    public Tacos(){
        this.nombre = "Tacos";
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public void setPuntaje(double max, int humedad, boolean es_mujer, boolean es_formal) {
        if(es_mujer){
            if(es_formal){
                this.puntaje = obligatorio;
            }
        }
    }
}
