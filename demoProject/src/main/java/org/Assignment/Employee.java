package org.Assignment;

public class Employee {
    public static void main(String[] args) {
        String fName = "Atul";
        String lName = "";

        try {
            validateFullName(fName, lName);
            System.out.println("Full name is valid.");
        } catch (EmployeeNameNotValidException e) {
            System.out.println("Full name is not valid: " + e.getMessage());
        }
    }

    public static void validateFullName(String fname, String lname) throws EmployeeNameNotValidException {
        if (fname == null || lname == null || fname.isBlank() || lname.isBlank()) {
            throw new EmployeeNameNotValidException();
        }
    }
}
