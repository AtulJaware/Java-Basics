package org.Assignment;

public class EmployeeNameNotValidException extends Exception {
    public EmployeeNameNotValidException() {

        super("Employee name is not valid.");
    }
}
