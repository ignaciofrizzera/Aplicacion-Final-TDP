package com.example.sandra.quemepongo.prendas.abrigos;


import com.example.sandra.quemepongo.visitors.Visitor;

/**
 * Clase destinada a la representacion de un chaleco.
 */
public class Chaleco extends Abrigo {

    public Chaleco(){
        this.nombre = "Chaleco";
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public void setPuntaje(double max, int humedad, boolean es_mujer, boolean es_formal) {
        if(!es_formal){
            if(max < 20 && max > 15)
                this.puntaje = opcional;
        }
    }
}
