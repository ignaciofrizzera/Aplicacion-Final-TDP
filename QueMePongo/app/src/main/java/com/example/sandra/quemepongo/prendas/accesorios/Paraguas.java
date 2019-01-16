package com.example.sandra.quemepongo.prendas.accesorios;

import com.example.sandra.quemepongo.visitors.Visitor;


/**
 * Clase destinada a la representacion de un paraguas.
 */
public class Paraguas extends Accesorios {

    public Paraguas(){
        this.nombre = "Paraguas";
    }

    @Override
    public void accept(Visitor v) {
        v.visitParaguas(this);
    }
}
