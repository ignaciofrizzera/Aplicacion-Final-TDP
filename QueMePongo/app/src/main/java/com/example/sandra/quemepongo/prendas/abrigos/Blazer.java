package com.example.sandra.quemepongo.prendas.abrigos;
import com.example.sandra.quemepongo.visitors.Visitor;


/**
 * Clase destinada a representar un blazer.
 */
public class Blazer extends Abrigo{

    public Blazer(){
        this.nombre = "Blazer";
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public void setPuntaje(double max, int humedad, boolean es_mujer, boolean es_formal) {
        if (es_mujer && es_formal) {
            if (max < 25) {
                this.puntaje = obligatorio;
            }
            if (max <= 15 && max > 10) {
                this.puntaje = opcional;
            }
        }
    }
}
