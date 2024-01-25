package org.example;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee(145, "Suresh", 20000, "Testing");
        employee.employeeDetails();

        //Method Overloading
        employee.softwareEngineer("Atul",15000.0);
        employee.softwareEngineer("Ravi",101);
        employee.softwareEngineer("Kapil","Testing");
        employee.softwareEngineer("Abhishek",111,"Clerk");
    }
}