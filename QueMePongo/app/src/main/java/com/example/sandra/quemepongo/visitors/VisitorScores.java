package com.example.sandra.quemepongo.visitors;

import com.example.sandra.quemepongo.data.PhoneData;
import com.example.sandra.quemepongo.prendas.Prenda;

/**
 * Visitor destinado a indicar a las prendas que seteen su puntaje brindando una serie de datos.
 */
public class VisitorScores implements Visitor {

    /*
     * La API para ciudades chicas considera la temp min = temp max
     * Se realizó el cálculo de los puntajes en base a la temperatura máxima, ya esta sea igual a la minima o distinta.
     */

    private final double max = PhoneData.getData().getTempMax();
    private final int humedad = PhoneData.getData().getHumedad();
    private final boolean es_mujer = PhoneData.getData().esMujer();
    private final boolean es_formal = PhoneData.getData().esFormal();

    @Override
    public void visit(Prenda p) {
        p.setPuntaje(max,humedad,es_mujer,es_formal);
    }
}
