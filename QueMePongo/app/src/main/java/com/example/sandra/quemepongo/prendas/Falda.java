package com.example.sandra.quemepongo.prendas;

import com.example.sandra.quemepongo.visitors.Visitor;

/**
 * Clase destinada a representar una falda.
 */
public class Falda extends Prenda {

    public Falda(){
        this.nombre = "Falda";
    }

    @Override
    public void accept(Visitor v) {
        v.visitFalda(this);
    }

}
