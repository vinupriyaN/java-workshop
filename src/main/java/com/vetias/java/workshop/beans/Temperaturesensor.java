package com.vetias.java.workshop.beans;
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
