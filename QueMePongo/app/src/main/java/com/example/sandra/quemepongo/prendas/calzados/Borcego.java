package com.example.sandra.quemepongo.prendas.calzados;

import com.example.sandra.quemepongo.visitors.Visitor;


/**
 * Clase destinada a representar borcegos.
 */
public class Borcego extends Calzado {

    public Borcego(){
        this.nombre = "Borcegos";
    }

    public void accept(Visitor v) {
        v.visitBorcego(this);
    }
}
