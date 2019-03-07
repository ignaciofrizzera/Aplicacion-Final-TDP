package com.example.sandra.quemepongo.prendas.abrigos;
import com.example.sandra.quemepongo.visitors.Visitor;

/**
 * Clase destinada a representar un tapado de paño.
 * NOTA: no se escribe de forma correcta con el objetivo de poder generar los JavaDoc.
 */
public class TapadoPanio extends Abrigo{

    public TapadoPanio(){
        this.nombre = "Tapado de paño";
    }

    @Override
    public void accept(Visitor v) {
        v.visitTapadoPanio(this);
    }
}
