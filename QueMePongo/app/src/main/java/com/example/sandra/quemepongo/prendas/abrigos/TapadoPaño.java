package com.example.sandra.quemepongo.prendas.abrigos;
import com.example.sandra.quemepongo.visitors.Visitor;

/**
 * Clase destinada a representar un tapado de paño.
 */
public class TapadoPaño extends Abrigo{

    public TapadoPaño(){
        this.nombre = "Tapado de paño";
    }

    @Override
    public void accept(Visitor v) {
        v.visitTapadoPaño(this);
    }
}
