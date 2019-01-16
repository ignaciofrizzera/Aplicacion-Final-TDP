package com.example.sandra.quemepongo.prendas.abrigos;

import com.example.sandra.quemepongo.visitors.Visitor;


/**
 * Clase destinada a la representacion de un sweater.
 */
public class Sweater extends Abrigo {

    public Sweater(){
        this.nombre = "Sweater";
    }

    public void accept(Visitor v) {
        v.visitSweater(this);
    }
}
