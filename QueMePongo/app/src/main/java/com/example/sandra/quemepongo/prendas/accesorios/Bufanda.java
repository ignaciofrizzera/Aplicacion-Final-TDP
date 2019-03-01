package com.example.sandra.quemepongo.prendas.accesorios;

import com.example.sandra.quemepongo.visitors.Visitor;


/**
 * Clase destinada a la representación de una bufanda.
 */
public class Bufanda extends Accesorios {

    public Bufanda(){
        this.nombre = "Bufanda";
    }

    @Override
    public void accept(Visitor v) {
        v.visitBufanda(this);
    }
}
