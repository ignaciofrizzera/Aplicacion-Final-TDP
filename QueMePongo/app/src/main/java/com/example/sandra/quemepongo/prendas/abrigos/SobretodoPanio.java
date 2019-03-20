package com.example.sandra.quemepongo.prendas.abrigos;


import com.example.sandra.quemepongo.visitors.Visitor;

/**
 * Clase destinada a representar un sobretodo de paño.
 * NOTA: no se escribe de forma correcta con el objetivo de poder generar los JavaDoc.
 */
public class SobretodoPanio extends Abrigo {

    public SobretodoPanio(){
        this.nombre = "Sobretodo de paño";
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public void setPuntaje(double max, int humedad, boolean es_mujer, boolean es_formal) {
        if(!es_mujer && es_formal){
            if(max <= 15)
                this.puntaje = opcional;
            if(max <= 10)
                this.puntaje = obligatorio;
        }
    }

}
