package com.example.sandra.quemepongo.prendas.pantalones;

import com.example.sandra.quemepongo.visitors.Visitor;

/**
 * Clase destinada a representar unos pantalones de vestir.
 */
public class PantalonVestir extends Pantalon {

    public PantalonVestir(){
        this.nombre = "Pantalon de vestir";
    }

    @Override
    public void accept(Visitor v) {
        v.visitPantalonVestir(this);
    }
}
