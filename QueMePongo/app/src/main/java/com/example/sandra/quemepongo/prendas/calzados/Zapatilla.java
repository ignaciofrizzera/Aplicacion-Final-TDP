package com.example.sandra.quemepongo.prendas.calzados;
import com.example.sandra.quemepongo.visitors.Visitor;

/**
 * Clase destinada a representar unas zapatillas.
 */
public class Zapatilla extends Calzado {

    public Zapatilla(){
        this.nombre = "Zapatillas";
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public void setPuntaje(double max, int humedad, boolean es_mujer, boolean es_formal) {
        if(!es_formal){
            this.puntaje = obligatorio;
        }
    }
}
