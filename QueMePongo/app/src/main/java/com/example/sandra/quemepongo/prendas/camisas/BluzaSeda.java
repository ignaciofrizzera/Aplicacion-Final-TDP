package com.example.sandra.quemepongo.prendas.camisas;

import com.example.sandra.quemepongo.visitors.Visitor;

/**
 * Clase destinada a representar una bluza de seda.
 */
public class BluzaSeda extends Camisa {

    public BluzaSeda(){
        this.nombre = "Bluza de seda";
    }

    @Override
    public void accept(Visitor v) {
        v.visitBluzaSeda(this);
    }
}
