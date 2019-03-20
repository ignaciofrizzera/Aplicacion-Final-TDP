package com.example.sandra.quemepongo.prendas;

import com.example.sandra.quemepongo.visitors.Visitor;

/**
 * Abstraccion de una prenda de ropa.
 */
public abstract class Prenda {
    protected double puntaje;
    protected String nombre;

    //La forma en que se puntean las prendas es subjectiva a la opinion del autor.

    /*
     * PUNTAJE = 10 - USAR SI O SI
     * PUNTAJE = 7.5 - OPCIONAL
     */
    public static final double obligatorio = 10;
    public static final double opcional = 7.5;

    /**
     * Devuelve el puntaje asignado a una prenda.
     * @return puntaje de una prenda.
     */
    public double getPuntaje(){
        return puntaje;
    }

    /**
     * Brinda a la prenda la serie de datos obtenidos del usuario para que esta determine su puntaje.
     * @param max temperatura maxima.
     * @param humedad porcentaje de humedad.
     * @param es_mujer indicador si el usuario es mujer.
     * @param es_formal indicador si el usuario se vestira formal.
     */
    public abstract void setPuntaje(double max, int humedad, boolean es_mujer, boolean es_formal);

    /**
     * Devuelve el nombre de una prenda.
     * @return nombre de una prenda.
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * Método que es parte del patrón de diseño Visitor.
     * @param v visitor el cuál será aceptado por la prenda.
     */
    public abstract void accept(Visitor v);

}
