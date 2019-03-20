package com.example.sandra.quemepongo.prendas.pantalones;

import com.example.sandra.quemepongo.visitors.Visitor;

/**
 * Clase destinada a representar unos pantalones tipo chinos.
 */
public class Chinos extends Pantalon {

    public Chinos(){
        this.nombre = "Pantalones chinos";
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public void setPuntaje(double max, int humedad, boolean es_mujer, boolean es_formal) {
        if(!es_mujer){
            if(es_formal){
                this.puntaje = opcional;
            }
            else{
                if(max < 25)
                    this.puntaje = obligatorio;
            }
        }
    }
}
