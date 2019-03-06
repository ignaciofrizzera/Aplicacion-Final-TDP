package com.example.sandra.quemepongo.prendas.calzados;
import com.example.sandra.quemepongo.visitors.Visitor;

/**
 * Clase destinada a representar unas zapatillas.
 */
public class Zapatilla extends Calzado {

    public Zapatilla(){
        this.nombre = "Zapatillas";
    }

    public void accept(Visitor v) {
        v.visitZapatilla(this);
    }
}
