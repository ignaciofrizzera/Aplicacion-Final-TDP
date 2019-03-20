package com.example.sandra.quemepongo.prendas.calzados;

import com.example.sandra.quemepongo.visitors.Visitor;


/**
 * Clase destinada a representar chatas.
 */
public class Chatas extends Calzado {

    public Chatas(){
        this.nombre = "Chatas";
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public void setPuntaje(double max, int humedad, boolean es_mujer, boolean es_formal) {
        if(es_mujer){
            if(es_formal){
                this.puntaje = obligatorio;
            }
            else{
                this.puntaje = opcional;
            }
        }
    }
}
