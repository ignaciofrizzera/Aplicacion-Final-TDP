package com.example.sandra.quemepongo.prendas.abrigos;

import com.example.sandra.quemepongo.visitors.Visitor;

/**
 * Clase destinada a representar un sweater oversized.
 */
public class OversizedSweater extends Abrigo {

    public OversizedSweater(){
        this.nombre = "Sweater oversized";
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public void setPuntaje(double max, int humedad, boolean es_mujer, boolean es_formal) {
        if(es_mujer && !es_formal){
            if(max < 20)
                this.puntaje = opcional;
            if(max < 15)
                this.puntaje = obligatorio;
        }
    }
}
