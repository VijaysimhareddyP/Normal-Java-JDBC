package org.example.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.*;

public class AddColleges {

    JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        System.out.println("setting jdbc template object and dataSource object");
        this.jdbcTemplate = jdbcTemplate;
    }

    public void addColleges() {

        int rows = jdbcTemplate.update("insert into Colleges values('abc2', 19, 'xyz2');");

        if(rows > 0) System.out.println("Successfully added " + rows + " Record(s)");
        else System.out.println("Failed to add Record(s). Try again.");
    }
}
