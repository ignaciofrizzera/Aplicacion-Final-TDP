package com.example.sandra.quemepongo.prendas.abrigos;

import com.example.sandra.quemepongo.visitors.Visitor;


/**
 * Clase destinada a la representacion de un chaleco.
 */
public class Chaleco extends Abrigo {

    public Chaleco(){
        this.nombre = "Chaleco";
    }

    public void accept(Visitor v) {
        v.visitChaleco(this);
    }
}
