package com.example.sandra.quemepongo.prendas.calzados;

import com.example.sandra.quemepongo.visitors.Visitor;


/**
 * Clase destinada a representar botas.
 */
public class Bota extends Calzado {

    public Bota(){
        this.nombre = "Botas";
    }

    public void accept(Visitor v) {
        v.visitBota(this);
    }
}
