package com.example.sandra.quemepongo.visitors;

import com.example.sandra.quemepongo.data.PhoneData;
import com.example.sandra.quemepongo.prendas.abrigos.Buzo;
import com.example.sandra.quemepongo.prendas.abrigos.Campera;
import com.example.sandra.quemepongo.prendas.abrigos.Chaleco;
import com.example.sandra.quemepongo.prendas.abrigos.Sweater;
import com.example.sandra.quemepongo.prendas.accesorios.Bufanda;
import com.example.sandra.quemepongo.prendas.accesorios.Gafas;
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

    /** TODO : SE PODRÍA USAR UN STATE.
     * PUNTAJE = 10 - USAR SI O SI
     * PUNTAJE = 7.5 - RECOMENDABLE
     * PUNTAJE = 5 - NO RECOMENDABLE
     * */

    private final double obligatorio = 10;
    private final double recomendable = 7.5;
    private final double no_recomendable = 5;

    /**Para la altura que el visitor trabaje, la data va a estar inicializada ya.*/
    private final double max = PhoneData.getData().getTempMax();
    private final double min = PhoneData.getData().getTempMin();
    private final int humedad = PhoneData.getData().getHumedad();
    private final boolean es_mujer = PhoneData.getData().esMujer();
    private final boolean es_formal = PhoneData.getData().esFormal();

    @Override
    public void visitCampera(Campera c) {
        //Independiente del estilo y el genero. Prenda bastante generica.
        if(max < 20) {
            c.setPuntaje(obligatorio);
        }
        else {
            if (max < 25 && min > 10) {
                c.setPuntaje(recomendable);
            }
            if (humedad > 80) {
                c.setPuntaje(recomendable);
            }
        }
        if(min > 20){
            c.setPuntaje(no_recomendable);
        }
    }

    @Override
    public void visitSweater(Sweater s) {
    }

    @Override
    public void visitBuzo(Buzo b) {

    }

    @Override
    public void visitChaleco(Chaleco c) {

    }

    @Override
    public void visitBufanda(Bufanda b) {

    }

    @Override
    public void visitGafas(Gafas g) {

    }

    @Override
    public void visitParaguas(Paraguas p) {

    }

    @Override
    public void visitBorcego(Borcego b) {

    }

    @Override
    public void visitBota(Bota b) {

    }

    @Override
    public void visitChatas(Chatas c) {

    }

    @Override
    public void visitMocasin(Mocasin m) {

    }

    @Override
    public void visitSandalia(Sandalia s) {

    }

    @Override
    public void visitTacos(Tacos t) {

    }

    @Override
    public void visitZapatillaDeportiva(ZapatillaDeportiva z) {

    }

    @Override
    public void visitZapatillaUrbana(ZapatillaUrbana z) {

    }

    @Override
    public void visitCamisaCorta(CamisaCorta c) {

    }

    @Override
    public void visitCamisaLarga(CamisaLarga c) {

    }

    @Override
    public void visitBermudas(Bermudas b) {

    }

    @Override
    public void visitShorts(Shorts s) {

    }

    @Override
    public void visitBabucha(Babucha b) {

    }

    @Override
    public void visitJean(Jean j) {

    }

    @Override
    public void visitRemeraCorta(MangaCorta r) {

    }

    @Override
    public void visitRemeraLarga(MangaLarga r) {

    }

    @Override
    public void visitMusculosa(Musculosa m) {

    }

    @Override
    public void visitTermica(Termica t) {

    }
}
