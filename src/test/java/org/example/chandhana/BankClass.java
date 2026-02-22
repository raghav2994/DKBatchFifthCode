package org.example.chandhana;

public class BankClass {
    String accountHolder;
    long accNo;
    double balance = 5000;

    public void insertCard() {
        System.out.println("Insert your card!");
        System.out.println("Welcome " + accountHolder + "!");
        System.out.println("Account Number : " + accNo);
    }

    public void deposit(double depostAmt) {
        System.out.println("Enter the amount to be deposited : " + depostAmt);
        balance += depostAmt;
        System.out.println("Current Balance : " + balance);
    }

    public void withdraw(double withdrawalAmt) {
        System.out.println("Enter the amount for withdrawal : " + withdrawalAmt);
        if(withdrawalAmt > balance) {
            System.out.println("Insufficient Balance!");
        }
        else {
            System.out.println("Withdrawal Successful!");
            balance -= withdrawalAmt;
            System.out.println("Current Balance : " + balance);
        }
    }

    public void checkBalance() {
        System.out.println("Available Balance : " + balance);
    }

}
