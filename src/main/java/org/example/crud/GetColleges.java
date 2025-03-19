package org.example.crud;

import org.example.model.College;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GetColleges {

    List<College> collegesList;
    public void getColleges() {

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jbdl76", "root", "VijayMysql@7");
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select * from colleges;")) {

            collegesList = new ArrayList<>();

            while (resultSet.next()) {
                College college = new College();
                college.setCollegeName(resultSet.getString(1));
                college.setCollegeId(resultSet.getInt(2));
                college.setLocation(resultSet.getString(3));
                collegesList.add(college);
            }
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        if(collegesList != null) {
            for (College college : collegesList) {
                System.out.println(college.getCollegeId() + " " + college.getCollegeName() + " " + college.getLocation());
            }
        }
    }
}
