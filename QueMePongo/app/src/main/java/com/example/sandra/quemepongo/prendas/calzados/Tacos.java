package com.example.sandra.quemepongo.prendas.calzados;

import com.example.sandra.quemepongo.visitors.Visitor;


/**
 * Clase destinada a representar tacos.
 */
public class Tacos extends Calzado {

    public Tacos(){
        this.nombre = "Tacos";
    }

    public void accept(Visitor v) {
        v.visitTacos(this);
    }
}
