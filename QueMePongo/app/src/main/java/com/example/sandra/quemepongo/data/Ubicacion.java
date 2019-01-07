package com.example.sandra.quemepongo.data;

public class Ubicacion {

    private float longitud,latitud;
    private String pais;
    private int amanecer;
    private int atardecer;
    private String ciudad;

    public Ubicacion(){

    }

    public String getCiudad(){
        return ciudad;
    }

    public String getPais(){
        return pais;
    }

    public void setLatitud(float latitud){
        this.latitud = latitud;
    }
    public void setLongitud(float longitud){
        this.longitud = longitud;
    }
    public void setPais(String pais){
        this.pais = pais;
    }
    public void setAmanecer(int amanecer){
        this.amanecer = amanecer;
    }
    public void setAtardecer(int atardecer){
        this.atardecer = atardecer;
    }
    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }
}
