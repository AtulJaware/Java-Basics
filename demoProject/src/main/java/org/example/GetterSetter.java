package org.example;

public class GetterSetter {
    private final int empId;
    private String empName;

    // Parameterized constructor
    public GetterSetter(int empId,String empName) {
        this.empName = empName;
        this.empId = empId;
    }

    // Setter method for name
    public void setName(String empName) {
        this.empName = empName;
    }

    // Method to print information
    public void printInformation() {
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Id: " + empId);
    }

    public static void main(String[] args) {

        GetterSetter obj = new GetterSetter(111,"Atul");

        obj.printInformation();

        // Update the name using the setter method
        obj.setName("Ravi");

        // Print the updated information
        System.out.println("\nUpdated information:");
        obj.printInformation();
    }
}
