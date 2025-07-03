package src.com.java.workshop.temperaturedata.beans;
public class Sensor {
    private String name;
    private int sensorid;
    private double temperature;
    public void setName(String aName)
    {
            name=aName;
    }
    public String getName()
    {
            return name;
    }
    public void setSensorid(int aSensorid)
    {
            sensorid=aSensorid;
    }
    public int getSensorid()
    {
            return sensorid;
    }
    public void setTemperature(double aTemperature)
    {
            temperature=aTemperature;
    }
    public double getTemperature()
    {
            return temperature;
    }
    
}
    

