package com.example.sandra.quemepongo.prendas;

import com.example.sandra.quemepongo.visitors.Visitor;

/**
 * Clase destinada a representar un vestido clasico.
 */
public class VestidoClasico extends Prenda {

    public VestidoClasico(){
        this.nombre = "Vestido clasico";
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
