package com.example.sandra.quemepongo.visitors;

import com.example.sandra.quemepongo.data.PhoneData;
import com.example.sandra.quemepongo.prendas.abrigos.Buzo;
import com.example.sandra.quemepongo.prendas.abrigos.Campera;
import com.example.sandra.quemepongo.prendas.abrigos.Chaleco;
import com.example.sandra.quemepongo.prendas.abrigos.Sweater;
import com.example.sandra.quemepongo.prendas.accesorios.Bufanda;
import com.example.sandra.quemepongo.prendas.accesorios.Paraguas;
import com.example.sandra.quemepongo.prendas.calzados.Borcego;
import com.example.sandra.quemepongo.prendas.calzados.Bota;
import com.example.sandra.quemepongo.prendas.calzados.Chatas;
import com.example.sandra.quemepongo.prendas.calzados.Mocasin;
import com.example.sandra.quemepongo.prendas.calzados.Sandalia;
import com.example.sandra.quemepongo.prendas.calzados.Tacos;
import com.example.sandra.quemepongo.prendas.calzados.zapatillas.ZapatillaDeportiva;
import com.example.sandra.quemepongo.prendas.calzados.zapatillas.ZapatillaUrbana;
import com.example.sandra.quemepongo.prendas.camisas.CamisaCorta;
import com.example.sandra.quemepongo.prendas.camisas.CamisaLarga;
import com.example.sandra.quemepongo.prendas.pantalones.Babucha;
import com.example.sandra.quemepongo.prendas.pantalones.Jean;
import com.example.sandra.quemepongo.prendas.pantalones.cortos.Bermudas;
import com.example.sandra.quemepongo.prendas.pantalones.cortos.Shorts;
import com.example.sandra.quemepongo.prendas.remeras.MangaCorta;
import com.example.sandra.quemepongo.prendas.remeras.MangaLarga;
import com.example.sandra.quemepongo.prendas.remeras.Musculosa;
import com.example.sandra.quemepongo.prendas.remeras.Termica;

/**
 * Visitor destinado a determinar el puntaje de las prendas.
 */
public class VisitorPrenda implements Visitor {

    /**La forma en que se puntean las prendas es subjectiva a la opinion del autor.*/

    /** TODO : SE PODRÍA USAR UN STATE.
     * PUNTAJE = 10 - USAR SI O SI
     * PUNTAJE = 7.5 - RECOMENDABLE
     * */

    private final double obligatorio = 10;
    private final double recomendable = 7.5;

    /**Para la altura que el visitor trabaje, la data va a estar inicializada ya.*/
    private final double max = PhoneData.getData().getTempMax();
    private final double min = PhoneData.getData().getTempMin();
    private final int humedad = PhoneData.getData().getHumedad();
    private final boolean es_mujer = PhoneData.getData().esMujer();
    private final boolean es_formal = PhoneData.getData().esFormal();

    /**
     * La API para ciudades chicas considera la temp min = temp max
     * Realizar el visitor en base a la temperatura act o considerar el caso de min =! max para ciudades grandes?
     * */

    @Override
    public void visitCampera(Campera c) {
        if(max < 15) {
            c.setPuntaje(obligatorio);
        }
        else {
            if (max < 20 && max > 10) {
                c.setPuntaje(recomendable);
            }
            if (humedad > 80) {
                c.setPuntaje(recomendable);
            }
        }
    }

    @Override
    public void visitSweater(Sweater s) {
        if(es_formal){
            if(max < 20){
                s.setPuntaje(obligatorio);
            }
            if(max < 25 && max > 20){
                s.setPuntaje(recomendable);
            }
        }
    }

    @Override
    public void visitBuzo(Buzo b) {
        if(!es_formal){
            if(max < 20){
                b.setPuntaje(obligatorio);
            }
            if(max < 25 && max > 20){
                b.setPuntaje(recomendable);
            }
        }
    }

    @Override
    public void visitChaleco(Chaleco c) {
        if(es_formal){
            if(!es_mujer){
                if(max < 20 && max > 15)
                    c.setPuntaje(recomendable);
            }
        }
        else{
            if(max < 20)
                c.setPuntaje(recomendable);
        }
    }

    @Override
    public void visitBufanda(Bufanda b) {
        if(max < 20){
            b.setPuntaje(recomendable);
        }
        else {
            if (max < 15) {
                b.setPuntaje(obligatorio);
            }
        }
    }

    @Override
    public void visitParaguas(Paraguas p) {
        if(humedad >90){
            p.setPuntaje(obligatorio);
        }
        else {
            if (humedad < 90 && humedad > 75) {
                p.setPuntaje(recomendable);
            }
        }
    }

    @Override
    public void visitBorcego(Borcego b) {
        if(!es_mujer){
            if(max < 15){
                b.setPuntaje(recomendable);
            }
            if(max < 10){
                b.setPuntaje(obligatorio);
            }
        }
    }

    @Override
    public void visitBota(Bota b) {
        if(!es_formal){
            if(max < 15){
                b.setPuntaje(recomendable);
            }
            if(max < 10){
                b.setPuntaje(obligatorio);
            }
        }
    }

    @Override
    public void visitChatas(Chatas c) {
        if(es_mujer){
            if(es_formal){
                c.setPuntaje(obligatorio);
            }
            else{
                c.setPuntaje(recomendable);
            }
        }
    }

    @Override
    public void visitMocasin(Mocasin m) {
        if(es_formal){
            if(!es_mujer) {
                m.setPuntaje(obligatorio);
            }
            else{
                m.setPuntaje(recomendable);
            }
        }
    }

    @Override
    public void visitSandalia(Sandalia s) {
        if(!es_formal){
            if(max > 25){
                s.setPuntaje(obligatorio);
            }
            if(max > 20){
                s.setPuntaje(recomendable);
            }
        }
    }

    @Override
    public void visitTacos(Tacos t) {
        if(es_mujer){
            if(es_formal){
                t.setPuntaje(obligatorio);
            }
        }

    }

    @Override
    public void visitZapatillaDeportiva(ZapatillaDeportiva z) {
        if(!es_formal){
            z.setPuntaje(obligatorio);
        }
    }

    @Override
    public void visitZapatillaUrbana(ZapatillaUrbana z) {
        if(!es_formal){
            z.setPuntaje(obligatorio);
        }
        else{
            z.setPuntaje(recomendable);
        }
    }

    @Override
    public void visitCamisaCorta(CamisaCorta c) {
        if(es_formal){
            if(max > 20){
                c.setPuntaje(obligatorio);
            }
        }
        else{
            if(max > 20){
                c.setPuntaje(recomendable);
            }
        }
    }

    @Override
    public void visitCamisaLarga(CamisaLarga c) {
        if(es_formal){
            if(!es_mujer) {
                c.setPuntaje(obligatorio);
            }
            else{
                c.setPuntaje(recomendable);
            }
        }
    }

    @Override
    public void visitBermudas(Bermudas b) {
        if(!es_mujer && !es_formal){
            if (max > 20){
                b.setPuntaje(recomendable);
            }
            if (max > 25) {
                b.setPuntaje(obligatorio);
            }
        }
    }

    @Override
    public void visitShorts(Shorts s) {
        if(!es_formal){
            if (max > 20){
                s.setPuntaje(recomendable);
            }
            if (max > 25) {
                s.setPuntaje(obligatorio);
            }
        }
    }

    @Override
    public void visitBabucha(Babucha b) {
        if(!es_formal){
            if(max < 25){
                b.setPuntaje(recomendable);
            }
            if(max < 20){
                b.setPuntaje(obligatorio);
            }
        }
    }
    @Override
    public void visitJean(Jean j) {
        if(max < 30 && max > 20) {
            j.setPuntaje(recomendable);
        }
        if(max < 20) {
            j.setPuntaje(obligatorio);
        }
    }

    @Override
    public void visitRemeraCorta(MangaCorta r) {
        if(!es_formal){
            if(max > 15) {
                r.setPuntaje(recomendable);
            }
            if(max > 25) {
                r.setPuntaje(obligatorio);
            }
        }
    }

    @Override
    public void visitRemeraLarga(MangaLarga r) {
        if(!es_formal){
            if(max < 20) {
                r.setPuntaje(recomendable);
            }
            if(max < 15) {
                r.setPuntaje(obligatorio);
            }
        }
    }

    @Override
    public void visitMusculosa(Musculosa m) {
        if(!es_formal) {
            if (max > 20){
                m.setPuntaje(recomendable);
            }
            if (max > 25) {
                m.setPuntaje(obligatorio);
            }
        }
    }

    @Override
    public void visitTermica(Termica t) {
        if(max < 15)
            t.setPuntaje(recomendable);
        if(max < 10)
            t.setPuntaje(obligatorio);
    }
}
