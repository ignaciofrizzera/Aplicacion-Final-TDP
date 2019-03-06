package com.example.sandra.quemepongo.prendas.accesorios;

import com.example.sandra.quemepongo.visitors.Visitor;

/**
 * Clase destinada a representar un pañuelo de seda.
 */
public class PañueloSeda extends Accesorios{

    public PañueloSeda(){
        this.nombre = "Pañuelo de seda";
    }

    @Override
    public void accept(Visitor v) {
        v.visitPañueloSeda(this);
    }
}
