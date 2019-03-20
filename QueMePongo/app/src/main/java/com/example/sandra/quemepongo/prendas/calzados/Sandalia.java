package com.example.sandra.quemepongo.prendas.calzados;

import com.example.sandra.quemepongo.visitors.Visitor;


/**
 * Clase destinada a representar sandalias.
 */
public class Sandalia extends Calzado {

    public Sandalia(){
        this.nombre = "Sandalias";
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public void setPuntaje(double max, int humedad, boolean es_mujer, boolean es_formal) {
        if(!es_formal){
            if(max > 25){
                this.puntaje = obligatorio;
            }
            if(max > 20){
                this.puntaje = opcional;
            }
        }
    }
}
