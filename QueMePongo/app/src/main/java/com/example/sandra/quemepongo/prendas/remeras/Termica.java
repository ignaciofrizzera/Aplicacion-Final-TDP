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
        v.visitTermica(this);
    }
}
