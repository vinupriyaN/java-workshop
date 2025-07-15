package com.vetias.java.workshop.temperaturedata;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.vetias.java.workshop.temperaturedata.beans.Organisation;
import com.vetias.java.workshop.temperaturedata.dao.OrganizationDAO;
public class JDBCExample 
{
    public static void main(String[] args)
     {
        Connection dbConnection = null;
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            dbConnection=DriverManager.getConnection("jdbc:h2:mem:temperaturedataDB","sa",null);
        } catch (SQLException sqlExecption) {
            System.out.println("error connecting to database: " + sqlExecption.getMessage());
        }
        OrganizationDAO organizationDAO = new OrganizationDAO();
        organizationDAO.createTable( dbConnection);
        Organisation vet = new Organisation("Vetias Tech",
            "Thindal,Erode",
            "www.vetias.com",
            "vetias@gmail.com",
            "9363983060",
            24221332);
            organizationDAO.save(dbConnection,vet);
            Organisation myorg = organizationDAO.findByName(dbConnection ,"Vetias Tech");
            {
            System.out.println("My Organization is: " + myorg);
            }
             
        
    }
    
}
