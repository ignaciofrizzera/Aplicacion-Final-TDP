package com.example.sandra.quemepongo.prendas;

import com.example.sandra.quemepongo.visitors.Visitor;

/**
 * Clase destinada a representar un vestido clasico.
 */
public class VestidoClasico extends Prenda {

    public VestidoClasico(){
        this.nombre = "Vestido clasico";
    }

    @Override
    public void accept(Visitor v) {
        v.visitVestidoClasico(this);
    }
}
