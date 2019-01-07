package com.example.sandra.quemepongo.data;

/**
 * Clase encargada de almacenar los datos del usuario.
 */
public class PhoneData {

    private static PhoneData data = null;

    private int humedad;
    private String genero;
    private String estilo;
    private double temp_min;
    private double temp_max;
    private double temp_actual;
    private String ciudad;

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
            return new PhoneData();
        return data;
    }

    /**
     * Retorna el genero del usuario.
     * @return genero del usuario.
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Retorna el estilo de vestir del usuario.
     * @return estilo de vestir del usuario.
     */
    public String getEstilo(){
        return estilo;
    }

    public double getTempAct(){
        return temp_actual;
    }
    /**
     * Setea el estilo de vestir del usuario. Puede ser casual o formal.
     * @param estilo estilo de vestir del usuario.
     */
    public void setEstilo(String estilo){
        this.estilo = estilo;
    }

    /**
     * Setea el genero del usuario. Puede ser femenino o masculino.
     * @param genero genero del usuario.
     */
    public void setGenero(String genero){
        this.genero = genero;
    }

    public void setTempMin(double temp_min){
        this.temp_min = temp_min;
    }
    public void setTempMax(double temp_max){
        this.temp_max = temp_max;
    }
    public void setTempAct(double temp_actual){
        this.temp_actual = temp_actual;
    }
    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }
    public void setHumedad(int humedad){
        this.humedad = humedad;
    }

}
