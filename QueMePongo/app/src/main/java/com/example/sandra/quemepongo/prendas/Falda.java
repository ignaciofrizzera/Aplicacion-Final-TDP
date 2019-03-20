package com.example.sandra.quemepongo.prendas;

import com.example.sandra.quemepongo.visitors.Visitor;

/**
 * Clase destinada a representar una falda.
 */
public class Falda extends Prenda {

    public Falda(){
        this.nombre = "Falda";
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public void setPuntaje(double max, int humedad, boolean es_mujer, boolean es_formal) {
        if(es_mujer && es_formal){
            if(max > 20)
                this.puntaje = obligatorio;
        }
    }
}
