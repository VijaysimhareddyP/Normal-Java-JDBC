package org.example.crud;

import org.example.model.College;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class GetColleges {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void getColleges() {

        List<College> collegeList = jdbcTemplate.query("select * from Colleges;", new CollegeRowMapper());

        for (College college : collegeList) {
            System.out.println(college.getCollegeId() + " " + college.getCollegeName() + " " + college.getLocation());
        }
    }
}
