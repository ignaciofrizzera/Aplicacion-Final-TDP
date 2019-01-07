package com.example.sandra.quemepongo.data;

public class Clima {

    private Ubicacion ubicacion;
    private int humedad;
    private int presion;
    private float temp_actual;
    private float temp_min;
    private float temp_max;

    public Clima(){

    }

    public void setUbicacion(Ubicacion ubicacion){
        this.ubicacion = ubicacion;
    }
    public void setPresion(int presion){
        this.presion = presion;
    }
    public void setHumedad(int humedad){
        this.humedad = humedad;
    }
    public void setTempActual(float temp_actual){
        this.temp_actual = temp_actual;
    }
    public void setTempMin(float temp_min){
        this.temp_min = temp_min;
    }
    public void setTempMax(float temp_max){
        this.temp_max = temp_max;
    }

    public Ubicacion getUbicacion(){
        return ubicacion;
    }
}
