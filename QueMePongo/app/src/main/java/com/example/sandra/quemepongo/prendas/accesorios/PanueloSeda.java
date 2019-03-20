package com.example.sandra.quemepongo.prendas.accesorios;

import com.example.sandra.quemepongo.visitors.Visitor;

/**
 * Clase destinada a representar un panuelo de seda.
 * NOTA: no se escribe de forma correcta con el objetivo de poder generar los JavaDoc.
 */
public class PanueloSeda extends Accesorios{

    public PanueloSeda(){
        this.nombre = "Pañuelo de seda";
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public void setPuntaje(double max, int humedad, boolean es_mujer, boolean es_formal) {
        if(es_mujer && es_formal){
            if(max < 20)
                this.puntaje = obligatorio;
        }
    }
}
