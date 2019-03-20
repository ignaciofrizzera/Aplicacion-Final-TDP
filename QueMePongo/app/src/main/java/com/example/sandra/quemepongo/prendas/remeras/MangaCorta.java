package com.example.sandra.quemepongo.prendas.remeras;

import com.example.sandra.quemepongo.visitors.Visitor;


/**
 * Clase destinada a representar una remera manga corta.
 */
public class MangaCorta extends Remera {

    public MangaCorta(){
        this.nombre = "Remera manga corta";
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public void setPuntaje(double max, int humedad, boolean es_mujer, boolean es_formal) {
        if(!es_formal && max > 15 ){
            this.puntaje = obligatorio;
        }
    }
}
