package com.example.sandra.quemepongo.prendas.abrigos;

import com.example.sandra.quemepongo.visitors.Visitor;

/**
 * Clase destinada a la representacion de una campera.
 */
public class Campera extends Abrigo{

    public Campera(){
        this.nombre = "Campera";
    }

    @Override
    public void accept(Visitor v) {
        v.visitCampera(this);
    }
}
