package com.example.sandra.quemepongo.prendas.camisas;

import com.example.sandra.quemepongo.visitors.Visitor;


/**
 * Clase destinada a representar una camisa manga corta.
 */
public class CamisaCorta extends Camisa {

    public CamisaCorta(){
        this.nombre = "Camisa manga corta";
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public void setPuntaje(double max, int humedad, boolean es_mujer, boolean es_formal) {
        if(es_formal && !es_mujer){
            if(max > 20){
                this.puntaje = opcional;
            }
            if(max > 25){
                this.puntaje = obligatorio;
            }
        }
    }
}
