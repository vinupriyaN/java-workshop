package com.vetias.java.workshop.temperaturedata.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.vetias.java.workshop.temperaturedata.beans.Organisation;


public class OrganizationDAO {
    public void createTable(Connection dbConnection){
        try {
            Class.forName("org.h2.Driver");
            
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        
        try(Statement statement =dbConnection.createStatement()){
            statement.execute("""
                create table organization(
                id int AUTO_INCREMENT PRIMARY KEY,
                NAME VARCHAR(100),
                WEBSITE VARCHAR(100),
                EMAIL VARCHAR(100),
                PHONE_NUMBER VARCHAR(100),
                REGISTRATION_NO INT,
                DESCRIPTION VARCHAR(225))
                """);
        } catch (SQLException sqlException) {
            System.out.println("error creating table: " + sqlException.getMessage());
        }

    }
    public int save(Connection dbConnection, Organisation organization) {
        try (PreparedStatement preparedStatement = dbConnection.prepareStatement("""
            INSERT INTO organization (NAME, WEBSITE, EMAIL, PHONE_NUMBER, REGISTRATION_NO, DESCRIPTION)values (?, ?, ?, ?, ?, ?)
                """)) {
            
            preparedStatement.setString(1, organization.name());
            preparedStatement.setString(2, organization.website());
            preparedStatement.setString(3, organization.email());
            preparedStatement.setString(4, organization.phoneNumber());
            preparedStatement.setInt(5, organization.registrationNo());
            
            
            
            preparedStatement.setString(6, organization.description());
           
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error saving organization: " + e.getMessage());
           
        }
         return 0;
    }
    public Organisation findByName(Connection dbConnection, String name) {
        Organisation organisation = null;

        try (PreparedStatement preparedStatement = dbConnection.prepareStatement("""
            SELECT * FROM organization WHERE NAME = ?
                """)) {
            preparedStatement.setString(1, name);
            ResultSet resultSet =preparedStatement.executeQuery();
            if (resultSet!=null && resultSet.next() 
            ) {
                organisation =  new Organisation(
                    resultSet.getString("NAME"),
                    resultSet.getString("DESCRIPTION"),
                    resultSet.getString("WEBSITE"),
                    resultSet.getString("EMAIL"),
                    resultSet.getString("PHONE_NUMBER"),
                    resultSet.getInt("REGISTRATION_NO")); 

            }
        } catch (SQLException e) {
            System.out.println("Error finding organization by name: " + e.getMessage());
        }
        return organisation;
    }
}
