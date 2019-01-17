package com.example.sandra.quemepongo.visitors;


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
 * Interfaz de un visitor.
 */
public interface Visitor {

    /**
     * Setea puntaje de una campera segun la información del usuario.
     * @param c campera a puntear.
     */
    public void visitCampera(Campera c);

    /**
     * Setea puntaje de un sweater segun la información del usuario.
     * @param s sweater a puntear.
     */
    public void visitSweater(Sweater s);

    /**
     * Setea puntaje de un buzo segun la información del usuario.
     * @param b buzo a puntear.
     */
    public void visitBuzo(Buzo b);

    /**
     * Setea puntaje de un chaleco segun la información del usuario.
     * @param c chaleco a puntear.
     */
    public void visitChaleco(Chaleco c);

    /**
     * Setea puntaje de una bufanda segun la información del usuario.
     * @param b bufanda a puntear.
     */
    public void visitBufanda(Bufanda b);


    /**
     * Setea puntaje de un paraguas segun la información del usuario.
     * @param p paraguas a puntear.
     */
    public void visitParaguas(Paraguas p);

    /**
     * Setea puntaje de unos borcegos segun la información del usuario.
     * @param b borcegos a puntear.
     */
    public void visitBorcego(Borcego b);

    /**
     * Setea puntaje de unas botas segun la información del usuario.
     * @param b botas a puntear.
     */
    public void visitBota(Bota b);

    /**
     * Setea puntaje de una chatas segun la información del usuario.
     * @param c chatas a puntear.
     */
    public void visitChatas(Chatas c);

    /**
     * Setea puntaje de unos mocasines segun la información del usuario.
     * @param m mocasines a puntear.
     */
    public void visitMocasin(Mocasin m);

    /**
     * Setea puntaje de unas sandalias segun la información del usuario.
     * @param s sandalias a puntear.
     */
    public void visitSandalia(Sandalia s);

    /**
     * Setea puntaje de unos tacos segun la información del usuario.
     * @param t tacos a puntear.
     */
    public void visitTacos(Tacos t);

    /**
     * Setea puntaje de unas zapatillas deportivas segun la información del usuario.
     * @param z zapatillas deportivas a puntear.
     */
    public void visitZapatillaDeportiva(ZapatillaDeportiva z);

    /**
     * Setea puntaje de unas zapatillas urbanas segun la información del usuario.
     * @param z zapatillas urbanas a puntear.
     */
    public void visitZapatillaUrbana(ZapatillaUrbana z);

    /**
     * Setea puntaje de una camisa manga corta segun la información del usuario.
     * @param c camisa manga corta a puntear.
     */
    public void visitCamisaCorta(CamisaCorta c);

    /**
     * Setea puntaje de una camisa manga larga segun la información del usuario.
     * @param c camisa manga larga a puntear.
     */
    public void visitCamisaLarga(CamisaLarga c);

    /**
     * Setea puntaje de unas bermuads segun la información del usuario.
     * @param b bermudas a puntear.
     */
    public void visitBermudas(Bermudas b);

    /**
     * Setea puntaje de unos shorts segun la información del usuario.
     * @param s shorts a puntear.
     */
    public void visitShorts(Shorts s);

    /**
     * Setea puntaje de unas babuchas segun la información del usuario.
     * @param b babuchas a puntear.
     */
    public void visitBabucha(Babucha b);

    /**
     * Setea puntaje de un jean segun la información del usuario.
     * @param j jean a puntear.
     */
    public void visitJean(Jean j);

    /**
     * Setea puntaje de una remera manga corta segun la información del usuario.
     * @param r remera manga corta a puntear.
     */
    public void visitRemeraCorta(MangaCorta r);

    /**
     * Setea puntaje de una remera manga larga segun la información del usuario.
     * @param r remera manga larga a puntear.
     */
    public void visitRemeraLarga(MangaLarga r);

    /**
     * Setea puntaje de una musculosa segun la información del usuario.
     * @param m musculosa a puntear.
     */
    public void visitMusculosa(Musculosa m);

    /**
     * Setea puntaje de una remera termica segun la información del usuario.
     * @param t remera termica a puntear.
     */
    public void visitTermica(Termica t);

}
