package com.example.sandra.quemepongo.prendas;

/**
 * Abstraccion de una prenda de ropa.
 */
public abstract class Prenda {
    protected float puntaje;
    protected String nombre;

    /**
     * Devuelve el puntaje asignado a una prenda.
     * @return puntaje de una prenda.
     */
    public float getPuntaje(){
        return puntaje;
    }

    /**
     * Establece el puntaje de una prenda.
     * @param puntaje puntaje asignado a la prenda.
     */
    public void setPuntaje(float puntaje){
        this.puntaje = puntaje;
    }

    /**
     * Devuelve el nombre de una prenda.
     * @return nombre de una prenda.
     */
    public String getNombre(){
        return nombre;
    }
}
