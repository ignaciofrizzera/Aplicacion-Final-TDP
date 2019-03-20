package com.example.sandra.quemepongo.prendas.accesorios;

import com.example.sandra.quemepongo.visitors.Visitor;


/**
 * Clase destinada a la representación de una bufanda.
 */
public class Bufanda extends Accesorios {

    public Bufanda(){
        this.nombre = "Bufanda";
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public void setPuntaje(double max, int humedad, boolean es_mujer, boolean es_formal) {
        if(max < 15){
            this.puntaje = opcional;
        }
        else {
            if (max < 10) {
                this.puntaje = obligatorio;
            }
        }
    }
}
