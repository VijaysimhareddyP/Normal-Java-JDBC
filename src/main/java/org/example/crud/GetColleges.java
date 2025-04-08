package org.example.crud;

import org.example.model.College;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GetColleges {

    JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void getColleges() {

        List<College> collegeList = jdbcTemplate.query("select * from Colleges;", new CollegeRowMapper());

        for (College college : collegeList) {
            System.out.println(college.getCollegeId() + " " + college.getCollegeName() + " " + college.getLocation());
        }
    }
}
