package org.example;

class Employee {
    private final int empId;
    private final String empName;
    private final double empSalary;
    private final String empDepartment;

    public Employee(int empId, String empName, double empSalary, String empDepartment) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
        this.empDepartment = empDepartment;
    }

    public void employeeDetails() {
        System.out.println("Employee ID: " + this.empId);
        System.out.println("Employee Name: " + this.empName);
        System.out.println("Employee Salary: " + this.empSalary);
        System.out.println("Employee Department: " + this.empDepartment);
    }

    public void softwareEngineer(String empName, double empSalary){
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Salary: " + empSalary);
    }
    public void softwareEngineer(String empName, int empId){
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
    }

    public void softwareEngineer(String empName,String empDepartment){
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Department: " + empId);
    }
    public void softwareEngineer(String empName, int empId, String empDepartment){
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Department: " + empDepartment);
    }
}