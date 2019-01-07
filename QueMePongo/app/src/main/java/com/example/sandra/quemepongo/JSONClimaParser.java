package com.example.sandra.quemepongo;

import com.example.sandra.quemepongo.data.Clima;
import com.example.sandra.quemepongo.data.Ubicacion;

import org.json.JSONException;
import org.json.JSONObject;

public class JSONClimaParser {

    public static Clima getWeather(String data) throws JSONException  {

        Clima clima = new Clima();
        JSONObject jObj = new JSONObject(data);

        Ubicacion loc = new Ubicacion();

        JSONObject coordObj = getObject("coord", jObj);
        loc.setLatitud(getFloat("lat", coordObj));
        loc.setLongitud(getFloat("lon", coordObj));

        JSONObject sysObj = getObject("sys", jObj);
        loc.setPais(getString("country", sysObj));
        loc.setAmanecer(getInt("sunrise", sysObj));
        loc.setAtardecer(getInt("sunset", sysObj));
        loc.setCiudad(getString("name", jObj));
        clima.setUbicacion(loc);

        /*
        JSONArray jArr = jObj.getJSONArray("weather");

        // We use only the first value
        JSONObject JSONWeather = jArr.getJSONObject(0);
        weather.currentCondition.setWeatherId(getInt("id", JSONWeather));
        weather.currentCondition.setDescr(getString("description", JSONWeather));
        weather.currentCondition.setCondition(getString("main", JSONWeather));
        weather.currentCondition.setIcon(getString("icon", JSONWeather));
        */

        JSONObject mainObj = getObject("main", jObj);
        clima.setHumedad(getInt("humidity", mainObj));
        clima.setPresion(getInt("pressure", mainObj));
        clima.setTempMax(getFloat("temp_max", mainObj));
        clima.setTempMin(getFloat("temp_min", mainObj));
        clima.setTempActual(getFloat("temp", mainObj));

        return clima;
    }


    private static JSONObject getObject(String tagName, JSONObject jObj)  throws JSONException {
        JSONObject subObj = jObj.getJSONObject(tagName);
        return subObj;
    }

    private static String getString(String tagName, JSONObject jObj) throws JSONException {
        return jObj.getString(tagName);
    }

    private static float  getFloat(String tagName, JSONObject jObj) throws JSONException {
        return (float) jObj.getDouble(tagName);
    }

    private static int  getInt(String tagName, JSONObject jObj) throws JSONException {
        return jObj.getInt(tagName);
    }

}