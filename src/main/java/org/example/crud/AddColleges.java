package org.example.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
    Object is created for AddColleges using @Repository tag, we are using component scanning from XML File which scans and creates object
    for this class and stores in IOC Container / Container ( i.e., ApplicationContext object in Main Class. Refer Main Class).
 */
@Repository
public class AddColleges {

    /**
        Dependency Injection is done using "Field injection" but not using Setter or Constructor Injection,
        so Setter method is not required.
     */
    // Field Injection
    @Autowired
    private JdbcTemplate jdbcTemplate;


    public void addColleges() {

        int rows = jdbcTemplate.update("insert into Colleges values('abc3', 20, 'xyz3');");

        if(rows > 0) System.out.println("Successfully added " + rows + " Record(s)");
        else System.out.println("Failed to add Record(s). Try again.");
    }
}
