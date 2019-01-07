package com.example.sandra.quemepongo;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;



public class ClienteClima {


    private static String BASE_URL = "http://api.openweathermap.org/data/2.5/weather?q=";
    private static String key = "83ab580fe33631641111971b6488e1cd";
    private String URL;


    public String getWeatherData(String location) {
        HttpURLConnection con = null ;
        InputStream is = null;

        try {
            con = (HttpURLConnection) ( new URL("http://api.openweathermap.org/data/2.5/weather?q=London,uk&APPID=83ab580fe33631641111971b6488e1cd")).openConnection();
            con.setRequestMethod("GET");
            con.setDoInput(true);
            con.setDoOutput(true);
            con.connect();

            // Let's read the response
            StringBuffer buffer = new StringBuffer();
            is = con.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String line = null;
            while ( (line = br.readLine()) != null )
                buffer.append(line + "rn");

            is.close();
            con.disconnect();
            return buffer.toString();
        }
        catch(Throwable t) {
            con.disconnect();
            return null;
        }
    }
}