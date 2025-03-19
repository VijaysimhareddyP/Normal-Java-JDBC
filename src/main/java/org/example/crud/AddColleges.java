package org.example.crud;

import java.sql.*;

public class AddColleges {
    public void addColleges() {
        int rows = 0;
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jbdl76", "root", "VijayMysql@7");
             Statement statement = connection.createStatement()) {

            rows = statement.executeUpdate("insert into colleges values('Sridevi', 16, 'Khanapur');");
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        if(rows > 0) System.out.println("Successfully added " + rows + " Record(s)");
        else System.out.println("Failed to add Record(s). Try again.");
    }
}
