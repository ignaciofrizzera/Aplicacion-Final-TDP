package com.example.sandra.quemepongo.prendas.calzados.zapatillas;

import com.example.sandra.quemepongo.visitors.Visitor;


/**
 * Clase destinada a representar una zapatilla urbana.
 */
public class ZapatillaUrbana extends Zapatilla{

    public ZapatillaUrbana(){
        this.nombre = "Zapatilla urbana";
    }

    public void accept(Visitor v) {
        v.visitZapatillaUrbana(this);
    }
}
