package com.example.sandra.quemepongo.prendas.abrigos;

import com.example.sandra.quemepongo.visitors.Visitor;

/**
 * Clase destinada a representar un sobretodo de paño.
 * NOTA: no se escribe de forma correcta con el objetivo de poder generar los JavaDoc.
 */
public class SobretodoPanio extends Abrigo {

    public SobretodoPanio(){
        this.nombre = "Sobretodo de paño";
    }

    @Override
    public void accept(Visitor v) {
        v.visitSobretodoPanio(this);
    }
}
