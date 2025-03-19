package org.example;

import org.example.crud.AddColleges;
import org.example.crud.GetColleges;

public class Main {
    public static void main(String[] args) {

        AddColleges addColleges = new AddColleges();
        addColleges.addColleges();

        GetColleges getColleges = new GetColleges();
        getColleges.getColleges();
    }
}