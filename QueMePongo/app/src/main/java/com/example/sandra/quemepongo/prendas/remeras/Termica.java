package com.example.sandra.quemepongo.prendas.remeras;

import com.example.sandra.quemepongo.visitors.Visitor;

/**
 * Clase destinada a representar una remera termica.
 */
public class Termica extends Remera {

    public Termica(){
        this.nombre = "Termica";
    }

    public void accept(Visitor v) {
        v.visitTermica(this);
    }
}
