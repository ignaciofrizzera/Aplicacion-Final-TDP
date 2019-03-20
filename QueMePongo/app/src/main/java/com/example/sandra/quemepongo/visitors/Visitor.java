package com.example.sandra.quemepongo.visitors;

import com.example.sandra.quemepongo.prendas.Prenda;


/**
 * Interfaz de un visitor.
 */
public interface Visitor {

    /**
     * Visita una prenda.
     * @param p prenda a visitar.
     */
    void visit(Prenda p);

}
