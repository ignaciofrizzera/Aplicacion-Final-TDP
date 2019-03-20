package com.example.sandra.quemepongo.prendas.camisas;

import com.example.sandra.quemepongo.visitors.Visitor;

/**
 * Clase destinada a representar una blusa de seda.
 */
public class BlusaSeda extends Camisa {

    public BlusaSeda(){
        this.nombre = "Blusa de seda";
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public void setPuntaje(double max, int humedad, boolean es_mujer, boolean es_formal) {
        if(es_mujer && es_formal){
            this.puntaje = obligatorio;
        }
    }
}
