package com.example.sandra.quemepongo.prendas.calzados;

import com.example.sandra.quemepongo.visitors.Visitor;


/**
 * Clase destinada a representar chatas.
 */
public class Chatas extends Calzado {

    public Chatas(){
        this.nombre = "Chatas";
    }

    public void accept(Visitor v) {
        v.visitChatas(this);
    }
}
