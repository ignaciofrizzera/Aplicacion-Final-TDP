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
        v.visitRemeraCorta(this);
    }
}
