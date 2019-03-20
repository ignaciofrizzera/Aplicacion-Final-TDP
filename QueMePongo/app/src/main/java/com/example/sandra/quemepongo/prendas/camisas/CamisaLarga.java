package com.example.sandra.quemepongo.prendas.camisas;

import com.example.sandra.quemepongo.visitors.Visitor;


/**
 * Clase destinada a representar una camisa manga larga.
 */
public class CamisaLarga extends Camisa {

    public CamisaLarga(){
        this.nombre = "Camisa manga larga";
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public void setPuntaje(double max, int humedad, boolean es_mujer, boolean es_formal) {
        if(es_formal){
            if(!es_mujer) {
                this.puntaje = obligatorio;
            }
            else{
                this.puntaje = opcional;
            }
        }
    }
}
