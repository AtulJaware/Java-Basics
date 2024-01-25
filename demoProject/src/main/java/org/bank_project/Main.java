package org.bank_project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // CurrentAccount ca=new CurrentAccount(1,"Ravi",10000.0);
       // SavingAccount sa=new SavingAccount(2,"Atul",10000.0);
        CurrentAccount ca= new CurrentAccount();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID :");
        ca.setId(Integer.parseInt(sc.nextLine()));
        System.out.println("Enter Name :");
        ca.setName(sc.nextLine());
        System.out.println("Enter Balance :");
        ca.setBalance(sc.nextDouble());

        System.out.println("ID :"+ca.getId());
        System.out.println("NAME :"+ca.getName());
        System.out.println("BALANCE :"+ca.getBalance());

        int ans;
        while(true) {
            System.out.println("Enter 1 for Deposit :");
            System.out.println("Enter 2 for Withdraw :");
             ans = sc.nextInt();
            if (ans == 1 || ans == 2) {
                break;
            }
            else{
                System.out.println("Invalid Input \n Try Again");
            }
        }
        System.out.println("Enter amount :");
        float amount=sc.nextFloat();
        if(ans==1){
            ca.deposit(amount);
        }
        else if(ans==2){
            ca.withdraw(amount);
        }


    }
}
