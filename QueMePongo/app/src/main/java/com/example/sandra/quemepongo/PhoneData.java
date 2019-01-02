package com.example.sandra.quemepongo;

/**
 * Clase encargada de almacenar los datos del usuario.
 */
public class PhoneData {

    private static PhoneData data = null;

    private String genero;
    private String estilo;

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

}
