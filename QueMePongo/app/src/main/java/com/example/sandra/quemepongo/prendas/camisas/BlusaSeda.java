package com.example.sandra.quemepongo.prendas.camisas;

import com.example.sandra.quemepongo.visitors.Visitor;

/**
 * Clase destinada a representar una blusa de seda.
 */
public class BlusaSeda extends Camisa {

    public BlusaSeda(){
        this.nombre = "Blusa de seda";
    }

    @Override
    public void accept(Visitor v) {
        v.visitBlusaSeda(this);
    }
}
