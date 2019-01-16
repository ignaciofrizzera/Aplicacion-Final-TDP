package com.example.sandra.quemepongo.prendas.accesorios;

import com.example.sandra.quemepongo.visitors.Visitor;


/**
 * Clase destinada a la representacion de gafas.
 */
public class Gafas extends Accesorios {

    public Gafas(){
        this.nombre = "Gafas";
    }

    public void accept(Visitor v) {
        v.visitGafas(this);
    }
}
