package com.example.sandra.quemepongo.prendas.calzados;

import com.example.sandra.quemepongo.visitors.Visitor;


/**
 * Clase destinada a representar mocasines.
 */
public class Mocasin extends Calzado {

    public Mocasin(){
        this.nombre = "Mocasines";
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public void setPuntaje(double max, int humedad, boolean es_mujer, boolean es_formal) {
        if(es_formal && !es_mujer){
            this.puntaje = obligatorio;
        }
    }
}
