package com.example.sandra.quemepongo.prendas.calzados;

import com.example.sandra.quemepongo.visitors.Visitor;


/**
 * Clase destinada a representar sandalias.
 */
public class Sandalia extends Calzado {

    public Sandalia(){
        this.nombre = "Sandalias";
    }

    public void accept(Visitor v) {
        v.visitSandalia(this);
    }
}
