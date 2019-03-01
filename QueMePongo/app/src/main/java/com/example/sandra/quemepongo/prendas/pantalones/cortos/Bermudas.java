package com.example.sandra.quemepongo.prendas.pantalones.cortos;

import com.example.sandra.quemepongo.prendas.pantalones.Pantalon;
import com.example.sandra.quemepongo.visitors.Visitor;


/**
 * Clase destinada a representar el pantalón corto tipo bermuda.
 */
public class Bermudas extends Pantalon {

    public Bermudas(){
        this.nombre = "Bermudas";
    }

    public void accept(Visitor v) {
        v.visitBermudas(this);
    }
}
