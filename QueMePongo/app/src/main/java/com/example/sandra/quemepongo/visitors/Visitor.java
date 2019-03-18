package com.example.sandra.quemepongo.visitors;


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
import com.example.sandra.quemepongo.prendas.camisas.BlusaSeda;
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
 * Interfaz de un visitor.
 * NOTA: algunos métodos están escritos de forma incorrecta con el objetivo de poder generar los JavaDoc.
 */
public interface Visitor {

    /**
     * Setea puntaje de una campera segun la información del usuario.
     * @param c campera a puntear.
     */
    void visitCampera(Campera c);

    /**
     * Setea puntaje de un sweater segun la información del usuario.
     * @param s sweater a puntear.
     */
    void visitSweater(Sweater s);

    /**
     * Setea puntaje de un buzo segun la información del usuario.
     * @param b buzo a puntear.
     */
    void visitBuzo(Buzo b);

    /**
     * Setea puntaje de un chaleco segun la información del usuario.
     * @param c chaleco a puntear.
     */
    void visitChaleco(Chaleco c);

    /**
     * Setea puntaje de una bufanda segun la información del usuario.
     * @param b bufanda a puntear.
     */
    void visitBufanda(Bufanda b);


    /**
     * Setea puntaje de un paraguas segun la información del usuario.
     * @param p paraguas a puntear.
     */
    void visitParaguas(Paraguas p);

    /**
     * Setea puntaje de unos borcegos segun la información del usuario.
     * @param b borcegos a puntear.
     */
    void visitBorcego(Borcego b);

    /**
     * Setea puntaje de unas botas segun la información del usuario.
     * @param b botas a puntear.
     */
    void visitBota(Bota b);

    /**
     * Setea puntaje de una chatas segun la información del usuario.
     * @param c chatas a puntear.
     */
    void visitChatas(Chatas c);

    /**
     * Setea puntaje de unos mocasines segun la información del usuario.
     * @param m mocasines a puntear.
     */
    void visitMocasin(Mocasin m);

    /**
     * Setea puntaje de unas sandalias segun la información del usuario.
     * @param s sandalias a puntear.
     */
    void visitSandalia(Sandalia s);

    /**
     * Setea puntaje de unos tacos segun la información del usuario.
     * @param t tacos a puntear.
     */
    void visitTacos(Tacos t);

    /**
     * Setea puntaje de unas zapatillas segun la información del usuario.
     * @param z zapatillas a puntear.
     */
    void visitZapatilla(Zapatilla z);

    /**
     * Setea puntaje de una camisa manga corta segun la información del usuario.
     * @param c camisa manga corta a puntear.
     */
    void visitCamisaCorta(CamisaCorta c);

    /**
     * Setea puntaje de una camisa manga larga segun la información del usuario.
     * @param c camisa manga larga a puntear.
     */
    void visitCamisaLarga(CamisaLarga c);

    /**
     * Setea puntaje de unas bermuads segun la información del usuario.
     * @param b bermudas a puntear.
     */
    void visitBermudas(Bermudas b);

    /**
     * Setea puntaje de unos shorts segun la información del usuario.
     * @param s shorts a puntear.
     */
    void visitShorts(Shorts s);

    /**
     * Setea puntaje de unas babuchas segun la información del usuario.
     * @param b babuchas a puntear.
     */
    void visitBabucha(Babucha b);

    /**
     * Setea puntaje de un jean segun la información del usuario.
     * @param j jean a puntear.
     */
    void visitJean(Jean j);

    /**
     * Setea puntaje de una remera manga corta segun la información del usuario.
     * @param r remera manga corta a puntear.
     */
    void visitRemeraCorta(MangaCorta r);

    /**
     * Setea puntaje de una remera manga larga segun la información del usuario.
     * @param r remera manga larga a puntear.
     */
    void visitRemeraLarga(MangaLarga r);

    /**
     * Setea puntaje de una musculosa segun la información del usuario.
     * @param m musculosa a puntear.
     */
    void visitMusculosa(Musculosa m);

    /**
     * Setea puntaje de una remera termica segun la información del usuario.
     * @param t remera termica a puntear.
     */
    void visitTermica(Termica t);

    /**
     * Setea puntaje de un blazer segun la información del usuario.
     * @param b blazer a puntear.
     */
    void visitBlazer(Blazer b);

    /**
     * Setea puntaje de un tapado de paño segun la informacion del usuario.
     * @param t tapado de paño a puntear.
     */
    void visitTapadoPanio(TapadoPanio t);

    /**
     * Setea puntaje de un sweater oversized segun la informacion del usuario.
     * @param s sweater oversized a puntear.
     */
    void visitOversizedSweater(OversizedSweater s);

    /**
     * Setea puntaje de un sobretodo de paño segun la informacion del usuario.
     * @param s sobretodo de paño a puntear.
     */
    void visitSobretodoPanio(SobretodoPanio s);

    /**
     * Setea puntaje de un pañuelo de seda segun la informaion del usuario.
     * @param p pañuelo de seda a puntear.
     */
    void visitPanueloSeda(PanueloSeda p);

    /**
     * Setea puntaje de unos pantalones chinos segun la informacion del usuario.
     * @param c pantalones chinos a puntear.
     */
    void visitChinos(Chinos c);

    /**
     * Setea puntaje de unos pantalones de vestir segun la informacion del usuario.
     * @param p pantalones de vestir a puntear.
     */
    void visitPantalonVestir(PantalonVestir p);

    /**
     * Setea puntaje de una blusa de seda segun la informacion del usuario.
     * @param b blusa de seda a puntear.
     */
    void visitBlusaSeda(BlusaSeda b);

    /**
     * Setea puntaje de un vestido clasico segun la informacion del usuario.
     * @param v vestido clasico a puntear.
     */
    void visitVestidoClasico(VestidoClasico v);

    /**
     * Setea puntaje de una falda segun la informacion del usuario.
     * @param f falda a puntear.
     */
    void visitFalda(Falda f);
}
