package org.example;

import org.example.crud.GetColleges;
import org.example.crud.Principal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {

//        AddColleges addColleges = new AddColleges();
//        addColleges.addColleges();

//        GetColleges getColleges = new GetColleges();
//        getColleges.getColleges();

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        GetColleges getColleges = context.getBean("getColleges", GetColleges.class);
        getColleges.principalDetails();

        Principal principal = context.getBean("principal", Principal.class);
        System.out.println(principal.getMobile());
        System.out.println(principal.getName());



    }
}