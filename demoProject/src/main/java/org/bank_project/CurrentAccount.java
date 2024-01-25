package org.bank_project;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurrentAccount {
    private int id;
    private String name;
    private double balance;

    public void withdraw(float amount) {
        double limit = balance * 0.3;
        limit = limit + balance;
        if (amount < limit) {
            balance -= amount;
            System.out.printf("Amount Rs. %.2f is withdraw sucessfully..!\n", amount);
            System.out.println("Your Current Account Balance is " + balance);
        } else {
            System.out.println("Insufficient Balance..!");
            System.out.println("Your Current Account Balance is " + balance);
        }
    }
    public void deposit(float amount){
        balance+=amount;
        System.out.printf("Rs. %.2f is deposited in your current account \n",amount);
        System.out.println("Your Current Account Balance is "+balance);
    }
}
