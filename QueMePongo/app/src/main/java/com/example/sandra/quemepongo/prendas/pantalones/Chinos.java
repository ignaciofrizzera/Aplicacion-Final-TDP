package com.example.sandra.quemepongo.prendas.pantalones;

import com.example.sandra.quemepongo.visitors.Visitor;

/**
 * Clase destinada a representar unos pantalones tipo chinos.
 */
public class Chinos extends Pantalon {

    public Chinos(){
        this.nombre = "Pantalones chinos";
    }

    @Override
    public void accept(Visitor v) {
        v.visitChinos(this);
    }
}
