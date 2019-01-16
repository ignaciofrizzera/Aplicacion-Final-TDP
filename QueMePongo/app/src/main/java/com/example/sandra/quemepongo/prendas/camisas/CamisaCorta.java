package com.example.sandra.quemepongo.prendas.camisas;

import com.example.sandra.quemepongo.visitors.Visitor;


/**
 * Clase destinada a representar una camisa manga corta.
 */
public class CamisaCorta extends Camisa {

    public CamisaCorta(){
        this.nombre = "Camisa manga corta";
    }

    public void accept(Visitor v) {
        v.visitCamisaCorta(this);
    }
}
