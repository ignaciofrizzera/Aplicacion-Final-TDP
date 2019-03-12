package com.example.sandra.quemepongo.visitors;

import com.example.sandra.quemepongo.data.PhoneData;
import com.example.sandra.quemepongo.prendas.Falda;
import com.example.sandra.quemepongo.prendas.VestidoClasico;
import com.example.sandra.quemepongo.prendas.abrigos.Blazer;
import com.example.sandra.quemepongo.prendas.abrigos.Buzo;
import com.example.sandra.quemepongo.prendas.abrigos.Campera;
import com.example.sandra.quemepongo.prendas.abrigos.Chaleco;
import com.example.sandra.quemepongo.prendas.abrigos.OversizedSweater;
import com.example.sandra.quemepongo.prendas.abrigos.SobretodoPanio;
import com.example.sandra.quemepongo.prendas.abrigos.Sweater;
import com.example.sandra.quemepongo.prendas.abrigos.TapadoPanio;
import com.example.sandra.quemepongo.prendas.accesorios.Bufanda;
import com.example.sandra.quemepongo.prendas.accesorios.Paraguas;
import com.example.sandra.quemepongo.prendas.accesorios.PanueloSeda;
import com.example.sandra.quemepongo.prendas.calzados.Borcego;
import com.example.sandra.quemepongo.prendas.calzados.Bota;
import com.example.sandra.quemepongo.prendas.calzados.Chatas;
import com.example.sandra.quemepongo.prendas.calzados.Mocasin;
import com.example.sandra.quemepongo.prendas.calzados.Sandalia;
import com.example.sandra.quemepongo.prendas.calzados.Tacos;
import com.example.sandra.quemepongo.prendas.calzados.Zapatilla;
import com.example.sandra.quemepongo.prendas.camisas.BluzaSeda;
import com.example.sandra.quemepongo.prendas.camisas.CamisaCorta;
import com.example.sandra.quemepongo.prendas.camisas.CamisaLarga;
import com.example.sandra.quemepongo.prendas.pantalones.Babucha;
import com.example.sandra.quemepongo.prendas.pantalones.Chinos;
import com.example.sandra.quemepongo.prendas.pantalones.Jean;
import com.example.sandra.quemepongo.prendas.pantalones.PantalonVestir;
import com.example.sandra.quemepongo.prendas.pantalones.cortos.Bermudas;
import com.example.sandra.quemepongo.prendas.pantalones.cortos.Shorts;
import com.example.sandra.quemepongo.prendas.remeras.MangaCorta;
import com.example.sandra.quemepongo.prendas.remeras.MangaLarga;
import com.example.sandra.quemepongo.prendas.remeras.Musculosa;
import com.example.sandra.quemepongo.prendas.remeras.Termica;

/**
 * Visitor destinado a determinar el puntaje de las prendas.
 *  * NOTA: algunos métodos están escritos de forma incorrecta con el objetivo de poder generar los JavaDoc.
 */
public class VisitorPrenda implements Visitor {

    /**La forma en que se puntean las prendas es subjectiva a la opinion del autor.*/

    /**
     * PUNTAJE = 10 - USAR SI O SI
     * PUNTAJE = 7.5 - OPCIONAL
     * */

    public static final double obligatorio = 10;
    public static final double opcional = 7.5;

    /**Para la altura que el visitor trabaje, la data estará inicializada ya.*/
    private final double max = PhoneData.getData().getTempMax();
    private final int humedad = PhoneData.getData().getHumedad();
    private final boolean es_mujer = PhoneData.getData().esMujer();
    private final boolean es_formal = PhoneData.getData().esFormal();

    /**
     * La API para ciudades chicas considera la temp min = temp max
     * Se realizó el cálculo de los puntajes en base a la temperatura máxima, ya esta sea igual a la minima o distinta.
     * */

    @Override
    public void visitCampera(Campera c) {
        if(!es_formal) {
            if (max <= 15) {
                c.setPuntaje(opcional);
            }
            if (max <= 10) {
                c.setPuntaje(obligatorio);
            }
            if (humedad > 90) {
                c.setPuntaje(opcional);
            }
        }
    }


    @Override
    public void visitSweater(Sweater s) {
        if(es_formal){
            if(max <= 15){
                s.setPuntaje(obligatorio);
            }
            if(max < 20 && max > 15){
                s.setPuntaje(opcional);
            }
        }
    }

    @Override
    public void visitBuzo(Buzo b) {
        if(!es_formal){
            if(max <= 15){
                b.setPuntaje(obligatorio);
            }
            if(max < 20 && max > 15){
                b.setPuntaje(opcional);
            }
        }
    }

    @Override
    public void visitChaleco(Chaleco c) {
        if(es_formal){
            if(max < 20 && max > 15)
                c.setPuntaje(opcional);
        }
    }

    @Override
    public void visitBufanda(Bufanda b) {
        if(max < 15){
            b.setPuntaje(opcional);
        }
        else {
            if (max < 10) {
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
                p.setPuntaje(opcional);
            }
        }
    }

    @Override
    public void visitBorcego(Borcego b) {
        if(!es_mujer && !es_formal){
            if(max < 15){
                b.setPuntaje(opcional);
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
                b.setPuntaje(opcional);
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
                c.setPuntaje(opcional);
            }
        }
    }

    @Override
    public void visitMocasin(Mocasin m) {
        if(es_formal && !es_mujer){
            m.setPuntaje(obligatorio);
        }
    }

    @Override
    public void visitSandalia(Sandalia s) {
        if(!es_formal){
            if(max > 25){
                s.setPuntaje(obligatorio);
            }
            if(max > 20){
                s.setPuntaje(opcional);
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
    public void visitZapatilla(Zapatilla z) {
        if(!es_formal){
            z.setPuntaje(obligatorio);
        }
    }

    @Override
    public void visitCamisaCorta(CamisaCorta c) {
        if(es_formal && !es_mujer){
            if(max > 20){
                c.setPuntaje(opcional);
            }
            if(max > 25){
                c.setPuntaje(obligatorio);
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
                c.setPuntaje(opcional);
            }
        }
    }

    @Override
    public void visitBermudas(Bermudas b) {
        if(!es_mujer && !es_formal){
            if (max > 20){
                b.setPuntaje(opcional);
            }
            if (max >= 25) {
                b.setPuntaje(obligatorio);
            }
        }
    }

    @Override
    public void visitShorts(Shorts s) {
        if(!es_formal){
            if (max > 20){
                s.setPuntaje(opcional);
            }
            if (max >= 25) {
                s.setPuntaje(obligatorio);
            }
        }
    }

    @Override
    public void visitBabucha(Babucha b) {
        if(!es_formal){
            if(max < 25){
                b.setPuntaje(opcional);
            }
            if(max < 20){
                b.setPuntaje(obligatorio);
            }
        }
    }
    @Override
    public void visitJean(Jean j) {
        if (!es_formal) {
            if (max <= 25) {
                j.setPuntaje(obligatorio);
            }
            else{
                j.setPuntaje(opcional);
            }
        }
    }

    @Override
    public void visitRemeraCorta(MangaCorta r) {
        if(!es_formal){
            if(max > 15) {
                r.setPuntaje(opcional);
            }
            if(max > 20) {
                r.setPuntaje(obligatorio);
            }
        }
    }

    @Override
    public void visitRemeraLarga(MangaLarga r) {
        if(!es_formal){
            if(max < 20) {
                r.setPuntaje(opcional);
            }
            if(max <= 15) {
                r.setPuntaje(obligatorio);
            }
        }
    }

    @Override
    public void visitMusculosa(Musculosa m) {
        if(!es_formal) {
            if (max > 20){
                m.setPuntaje(opcional);
            }
            if (max > 25) {
                m.setPuntaje(obligatorio);
            }
        }
    }

    @Override
    public void visitTermica(Termica t) {
        if (!es_formal) {
            if (max < 15)
                t.setPuntaje(opcional);
            if (max < 10)
                t.setPuntaje(obligatorio);
        }
    }

    @Override
    public void visitBlazer(Blazer b) {
        if (es_mujer && es_formal) {
            if (max < 25) {
                b.setPuntaje(obligatorio);
            }
            if (max <= 15 && max > 10) {
                b.setPuntaje(opcional);
            }
        }
    }

    @Override
    public void visitTapadoPanio(TapadoPanio t) {
        if(es_mujer && es_formal){
            if(max <= 15)
                t.setPuntaje(obligatorio);
        }
    }

    @Override
    public void visitOversizedSweater(OversizedSweater s) {
        if(es_mujer && !es_formal){
            if(max < 20)
                s.setPuntaje(opcional);
            if(max < 15)
                s.setPuntaje(obligatorio);
        }
    }

    @Override
    public void visitSobretodoPanio(SobretodoPanio s) {
        if(!es_mujer && es_formal){
            if(max <= 15)
                s.setPuntaje(opcional);
            if(max <= 10)
                s.setPuntaje(obligatorio);
        }
    }

    @Override
    public void visitPanueloSeda(PanueloSeda p) {
        if(es_mujer && es_formal){
            if(max < 20)
                p.setPuntaje(obligatorio);
        }
    }

    @Override
    public void visitChinos(Chinos c) {
        if(!es_mujer){
            if(es_formal){
                c.setPuntaje(opcional);
            }
            else{
                if(max < 25)
                    c.setPuntaje(obligatorio);
            }
        }
    }

    @Override
    public void visitPantalonVestir(PantalonVestir p) {
        if(es_formal){
            p.setPuntaje(obligatorio);
        }
    }

    @Override
    public void visitBluzaSeda(BluzaSeda b) {
        if(es_mujer && es_formal){
            b.setPuntaje(obligatorio);
        }
    }

    @Override
    public void visitVestidoClasico(VestidoClasico v) {
        if(es_mujer && es_formal){
            if(max > 20)
                v.setPuntaje(obligatorio);
        }
    }

    @Override
    public void visitFalda(Falda f) {
        if(es_mujer && es_formal){
            if(max > 20)
                f.setPuntaje(obligatorio);
        }
    }
}
