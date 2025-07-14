package com.vetias.java.workshop.temperaturedata.beans;
import java.time.LocalDate;
public class temperatureapplication {
    public static void main(String[] args)
    {
        Organisation org = new Organisation(
            "Vetias Tech",
            "Thindal,Erode",
            "www.vetias.com",
            "vetias@gmail.com",
            "9363983060",
            24221332,
            LocalDate.of(2007,07,11));
        System.out.println(org);
    }
}
