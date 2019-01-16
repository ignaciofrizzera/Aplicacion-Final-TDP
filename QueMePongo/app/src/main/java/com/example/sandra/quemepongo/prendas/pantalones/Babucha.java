package com.example.sandra.quemepongo.prendas.pantalones;

import com.example.sandra.quemepongo.visitors.Visitor;


/**
 * Clase destinada a representar el pantalon tipo babucha.
 */
public class Babucha extends Pantalon {

    public Babucha(){
        this.nombre = "Babucha";
    }

    public void accept(Visitor v) {
        v.visitBabucha(this);
    }
}
