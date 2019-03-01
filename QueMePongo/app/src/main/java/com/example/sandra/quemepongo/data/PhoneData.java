package com.example.sandra.quemepongo.data;

/**
 * Clase encargada de almacenar los datos del usuario.
 */
public class PhoneData {

    private static PhoneData data = null;

    private int humedad;
    private double temp_min;
    private double temp_max;
    private double temp_actual;
    private String ciudad;
    private boolean es_mujer;
    private boolean es_formal;

    /**
     * Singleton ya que en ejecucion se contara con una sola instancia de PhoneData.
     */
    private PhoneData(){
    }

    /**
     * Acceso a la unica instancia de PhoneData.
     * @return instancia de PhoneData.
     */
    public static PhoneData getData(){
        if(data == null)
            data = new PhoneData();
        return data;
    }

    /**
     * Retorna el genero del usuario, donde este puede ser femenino o másculino.
     * @return genero del usuario.
     */
    public boolean esMujer() {
        return es_mujer;
    }

    /**
     * Retorna el estilo de vestir del usuario, donde este puede ser formal o casual.
     * @return estilo de vestir del usuario.
     */
    public boolean esFormal(){
        return es_formal;
    }

    /**
     * Retorna la temperatura actual de la ciudad ignresada por el usuario.
     * @return temperatura actual de la ciudad ingresada por el usuario.
     */
    public double getTempAct(){
        return temp_actual;
    }

    /**
     * Retorna la temperatura mínima de la ciudad ignresada por el usuario.
     * @return temperatura mínima de la ciudad ingresada por el usuario.
     */
    public double getTempMin(){
        return temp_min;
    }

    /**
     * Retorna la temperatura máxima de la ciudad ignresada por el usuario.
     * @return temperatura máxima de la ciudad ingresada por el usuario.
     */
    public double getTempMax(){
        return temp_max;
    }

    /**
     * Retorna el nombre de la ciudad ingresada por el usuario.
     * @return el nombre de la ciudad ingresada por el usuario.
     */
    public String getCiudad(){
        return ciudad;
    }

    /**
     * Retorna el porcentaje de la humedad de la ciudad ingresada por el usuario.
     * @return porcentaje de la humedad de la ciudad ingresada por el usuario.
     */
    public int getHumedad(){
        return humedad;
    }

    /**
     * Setea el estilo de vestir del usuario. Puede ser casual o formal.
     * @param es_formal estilo de vestir del usuario.
     */
    public void setFormal(boolean es_formal){
        this.es_formal = es_formal;
    }

    /**
     * Setea el genero del usuario. Puede ser femenino o másculino.
     * @param es_mujer genero del usuario.
     */
    public void setMujer(boolean es_mujer){
        this.es_mujer = es_mujer;
    }

    /**
     * Setea la temperatura mínima de la ciuddad ingresada por el usuario.
     * @param temp_min temperatura mínima de la ciudad ingresada por el usuario.
     */
    public void setTempMin(double temp_min){
        this.temp_min = temp_min -  273.15;
    }

    /**
     * Setea la temperatura máxima de la ciudad ingresada por el usuario.
     * @param temp_max temperatura máxima de la ciudad ingresada por el usuario.
     */
    public void setTempMax(double temp_max){
        this.temp_max = temp_max -  273.15;
    }

    /**
     * Setea la temperatura actual de la ciudad ingresada por el usuario.
     * @param temp_actual temperatura actual de la ciudad ingresada por el usuario.
     */
    public void setTempAct(double temp_actual){
        this.temp_actual = temp_actual -  273.15;
    }

    /**
     * Setea el nombre de la ciudad ingresada por el usuario.
     * @param ciudad nombre de la ciudad ingresada por el usuario.
     */
    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }

    /**
     * Setea el porcentaje de humedad de la ciudad ingresada por el usuario.
     * @param humedad porcentaje de humedad de la ciudad ingresada por el usuario.
     */
    public void setHumedad(int humedad){
        this.humedad = humedad;
    }

}
