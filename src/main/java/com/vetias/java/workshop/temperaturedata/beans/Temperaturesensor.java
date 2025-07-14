package com.vetias.java.workshop.temperaturedata.beans;
public class Temperaturesensor implements Sensor {

    private float temperature;
    private Temperaturesensor(float aTemperature)
    {
        temperature=aTemperature;
    }
    public  float getReading()
    {
        return temperature;
    }
    
}
