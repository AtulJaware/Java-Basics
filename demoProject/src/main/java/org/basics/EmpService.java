package org.basics;

import java.util.ArrayList;
import java.util.List;

public class EmpService {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        // Add employee objects to the list
        employees.add(new Employee(1, "Atul", 15000));
        employees.add(new Employee(2, "Ravi", 12000));
        employees.add(new Employee(3, "Kapil", 8000));
        employees.add(new Employee(4, "Abhishek", 20000));

        // Increase the salary of employees whose salary is more than 1000 by 10%
        for (Employee employee : employees) {
            if (employee.getSalary() > 1000) {
                double increasedSalary = employee.getSalary() * 1.1; // 10% increase
                employee.setSalary(increasedSalary);
            }
        }

        // Print the updated list of employees
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
