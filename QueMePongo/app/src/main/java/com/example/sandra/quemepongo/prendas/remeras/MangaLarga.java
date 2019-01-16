package com.example.sandra.quemepongo.prendas.remeras;

import com.example.sandra.quemepongo.visitors.Visitor;


/**
 * Clase destinada a representar una remera manga larga.
 */
public class MangaLarga extends Remera{

    public MangaLarga(){
        this.nombre = "Remera manga larga";
    }

    public void accept(Visitor v) {
        v.visitRemeraLarga(this);
    }
}
