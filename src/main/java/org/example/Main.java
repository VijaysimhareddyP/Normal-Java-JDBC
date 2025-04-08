package org.example;

import org.example.crud.AddColleges;
import org.example.crud.GetColleges;
import org.example.crud.Principal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        AddColleges addColleges = context.getBean("addColleges", AddColleges.class);
        addColleges.addColleges();

        GetColleges getColleges = context.getBean("getColleges", GetColleges.class);
        getColleges.getColleges();
    }
}