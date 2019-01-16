package com.example.sandra.quemepongo.prendas.calzados;

import com.example.sandra.quemepongo.visitors.Visitor;


/**
 * Clase destinada a representar mocasines.
 */
public class Mocasin extends Calzado {

    public Mocasin(){
        this.nombre = "Mocasines";
    }

    public void accept(Visitor v) {
        v.visitMocasin(this);
    }
}
