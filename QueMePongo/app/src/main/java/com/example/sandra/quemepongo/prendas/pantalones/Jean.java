package com.example.sandra.quemepongo.prendas.pantalones;

import com.example.sandra.quemepongo.visitors.Visitor;


/**
 * Clase destinada a representar el pantalón tipo jean.
 */
public class Jean extends Pantalon {

    public Jean(){
        this.nombre = "Jean";
    }

    public void accept(Visitor v){
        v.visitJean(this);
    }
}
