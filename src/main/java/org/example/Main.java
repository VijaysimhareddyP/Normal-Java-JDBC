package org.example;

import org.example.crud.AddColleges;
import org.example.crud.GetColleges;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        /** Application Context Object / Container / IOC Container
            creates, holds, manages and maintains all the Beans mentioned in XML File.
         */

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Retrieving AddColleges Bean
        AddColleges addColleges = context.getBean("addColleges", AddColleges.class);
        addColleges.addColleges();

        // Retrieving GetColleges Bean
        GetColleges getColleges = context.getBean("getColleges", GetColleges.class);
        getColleges.getColleges();
    }
}