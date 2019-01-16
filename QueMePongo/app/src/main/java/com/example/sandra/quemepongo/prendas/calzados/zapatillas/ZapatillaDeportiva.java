package com.example.sandra.quemepongo.prendas.calzados.zapatillas;

import com.example.sandra.quemepongo.visitors.Visitor;


/**
 * Clase destinada a representar una zapatilla deportiva.
 */
public class ZapatillaDeportiva extends Zapatilla{

    public ZapatillaDeportiva(){
        this.nombre = "Zapatilla deportiva";
    }

    public void accept(Visitor v) {
        v.visitZapatillaDeportiva(this);
    }
}
