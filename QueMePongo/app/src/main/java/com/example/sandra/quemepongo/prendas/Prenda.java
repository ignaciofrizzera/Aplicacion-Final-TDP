package com.example.sandra.quemepongo.prendas;

import com.example.sandra.quemepongo.visitors.Visitor;

import java.util.ArrayList;

/**
 * Abstraccion de una prenda de ropa.
 */
public abstract class Prenda {
    protected double puntaje;
    protected String nombre;
    /**
     * Devuelve el puntaje asignado a una prenda.
     * @return puntaje de una prenda.
     */
    public double getPuntaje(){
        return puntaje;
    }

    /**
     * Establece el puntaje de una prenda.
     * @param puntaje puntaje asignado a la prenda.
     */
    public void setPuntaje(double puntaje){
        this.puntaje = puntaje;
    }

    /**
     * Devuelve el nombre de una prenda.
     * @return nombre de una prenda.
     */
    public String getNombre(){
        return nombre;
    }

    public abstract void accept(Visitor v);
}
