package com.example.sandra.quemepongo.prendas.abrigos;
import com.example.sandra.quemepongo.visitors.Visitor;

/**
 * Clase destinada a representar un sweater oversized.
 */
public class OversizedSweater extends Abrigo {

    public OversizedSweater(){
        this.nombre = "Sweater oversized";
    }

    @Override
    public void accept(Visitor v) {
        v.visitOversizedSweater(this);
    }
}
