package com.vetias.java.workshop.temperaturedata;
import com.vetias.java.workshop.temperaturedata.dao.OrganizationDAO;

public class JDBCExample{
    public static void main(String[] args) {
        OrganizationDAO organizationDAO = new OrganizationDAO();
        organizationDAO.createTable();
        
    }
    
}
