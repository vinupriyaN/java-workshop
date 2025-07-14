package com.vetias.java.workshop.temperaturedata.dao;
//import org.h2.jdbcx.JdbcDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class OrganizationDAO {
    public void createTable(){
        //JdbcDataSource h2dDataSource= new JdbcDataSource();
        //h2dDataSource.setURL("jdbc:h2:mem:temperaturedataDB");
        //h2dDataSource.setUser("sa");
        try {
            Class.forName("org.h2.driver");
            
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try(Connection dbConnection = DriverManager.getConnection("jdbc:h2:mem:temperaturedataDB","sa",null); 
            Statement statement =dbConnection.createStatement()){
            statement.execute("""
                create table organization(
                id int AUTO_INCREMENT PRIMARY KEY,
                NAME VARCHAR(100),
                WEBSITE VARCHAR(100),
                EMAIL VARCHAR(100),
                PHONE_NUMBER VARCHAR(100),
                REGISTRATION_NO INT,
                ADDRESS VARCHAR(225))
                """);
        } catch (SQLException sqlException) {
            System.out.println("error creating table: " + sqlException.getMessage());
        }

    }
}
