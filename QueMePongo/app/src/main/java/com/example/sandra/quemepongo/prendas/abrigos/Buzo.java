package com.example.sandra.quemepongo.prendas.abrigos;

import com.example.sandra.quemepongo.visitors.Visitor;


/**
 * Clase destinada a la representacion de un buzo.
 */
public class Buzo extends Abrigo {

    public Buzo(){
        this.nombre = "Buzo";
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public void setPuntaje(double max, int humedad, boolean es_mujer, boolean es_formal) {
        if(!es_formal && max <= 20){
            this.puntaje = obligatorio;
        }
    }
}
