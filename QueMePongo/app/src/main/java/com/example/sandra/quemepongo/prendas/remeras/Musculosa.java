package com.example.sandra.quemepongo.prendas.remeras;

import com.example.sandra.quemepongo.visitors.Visitor;


/**
 * Clase destinada a representar una remera musculosa.
 */
public class Musculosa extends Remera {

    public Musculosa(){
        this.nombre = "Musculosa";
    }


    public void accept(Visitor v) {
        v.visitMusculosa(this);
    }
}
