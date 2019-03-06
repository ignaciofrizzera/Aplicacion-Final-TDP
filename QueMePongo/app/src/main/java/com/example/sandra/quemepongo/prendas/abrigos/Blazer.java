package com.example.sandra.quemepongo.prendas.abrigos;
import com.example.sandra.quemepongo.visitors.Visitor;


/**
 * Clase destinada a representar un blazer.
 */
public class Blazer extends Abrigo{

    public Blazer(){
        this.nombre = "Blazer";
    }

    @Override
    public void accept(Visitor v) {
        v.visitBlazer(this);
    }
}
