package com.example.sandra.quemepongo.prendas.abrigos;

import com.example.sandra.quemepongo.visitors.Visitor;

/**
 * Clase destinada a representar un sobretodo de paño.
 */
public class SobretodoPaño extends Abrigo {

    public SobretodoPaño(){
        this.nombre = "Sobretodo de paño";
    }

    @Override
    public void accept(Visitor v) {
        v.visitSobretodoPaño(this);
    }
}
