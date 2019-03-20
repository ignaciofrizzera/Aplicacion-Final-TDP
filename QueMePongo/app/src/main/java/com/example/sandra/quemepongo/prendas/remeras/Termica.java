package com.example.sandra.quemepongo.prendas.remeras;

import com.example.sandra.quemepongo.visitors.Visitor;

/**
 * Clase destinada a representar una remera térmica.
 */
public class Termica extends Remera {

    public Termica(){
        this.nombre = "Remera térmica";
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public void setPuntaje(double max, int humedad, boolean es_mujer, boolean es_formal) {
        if (!es_formal) {
            if (max < 15)
                this.puntaje = opcional;
            if (max < 10)
                this.puntaje = obligatorio;
        }
    }
}
