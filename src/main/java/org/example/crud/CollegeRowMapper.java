package org.example.crud;

import org.example.model.College;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CollegeRowMapper implements RowMapper<College> {


    @Override
    public College mapRow(ResultSet rs, int rowNum) throws SQLException {
        College college = new College();

        college.setCollegeName(rs.getString("collegeName"));
        college.setCollegeId(rs.getInt("collegeId"));
        college.setLocation(rs.getString("location"));

        return college;
    }
}
