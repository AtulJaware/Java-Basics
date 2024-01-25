package org.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
    // Convert given list into map using java 8
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();

        emp.add(new Employee(1,"Atul"));
        emp.add(new Employee(2,"Ravi"));
        emp.add(new Employee(3,"Kapil"));
        emp.add(new Employee(1,"Abhi"));
        emp.add(new Employee(5,"Devraj"));

        Map<String, Employee> empMap=emp.stream()
                .collect(Collectors.toMap(Employee::getEmpName, employee -> employee));

        System.out.println(empMap);

    }
}
