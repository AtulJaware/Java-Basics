package org.bank_project;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SavingAccount {

    private int id;
    private String name;
    private double balance;

    public void withdraw(float amount) {
        if (amount < balance) {
            balance -= amount;
            System.out.printf("Amount Rs. %.2f is withdraw sucessfully..!\n", amount);
            System.out.println("Your Account Balance is " + balance);
        } else {
            System.out.println("Insufficient Balance..!");
            System.out.println("Your Account Balance is " + balance);
        }
    }
    public void deposit(float amount){
        balance+=amount;
        System.out.printf("Rs. %.2f is deposited in your account",amount);
        System.out.println("Your Account Balance is "+balance);
    }
}
