package com.example.sandra.quemepongo;

public class VerificadorURL {

    private static VerificadorURL instancia = null;
    private boolean isValid;


    protected VerificadorURL(){
        isValid = false;
    }

    public static VerificadorURL getInstancia(){
        if(instancia == null)
            instancia = new VerificadorURL();
        return instancia;
    }

    public void setValidURL(){
        isValid = true;
    }
    public void setInvalidURL(){
        isValid = false;
    }
    public boolean isValid(){
        return isValid;
    }
}