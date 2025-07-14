package com.vetias.java.workshop.temperaturedata.beans;
import java.time.LocalDate;
public record Organisation( String name,
    String address,
    String website,
    String email,
    String phoneNumber,
    long registrationNumber,
    LocalDate registrationdate){

}
