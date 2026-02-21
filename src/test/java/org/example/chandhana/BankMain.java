package org.example.chandhana;

public class BankMain {
    static void main(String[] args) {
        BankClass b1 = new BankClass();
        b1.accountHolder = "Arjun";
        b1.accNo = 123456789;
        b1.balance = 6000;
        b1.insertCard();
        b1.deposit(5000);
        b1.checkBalance();

        System.out.println();

        BankClass b2 = new BankClass();
        b2.accountHolder = "Bijoy";
        b2.accNo = 123456777;
        b2.balance = 2000;
        b2.insertCard();
        b2.withdraw(7000);
        b2.checkBalance();

        System.out.println();

        BankClass b3 = new BankClass();
        b3.accountHolder = "Charles";
        b3.accNo = 123456888;
        b3.balance = 8000;
        b3.insertCard();
        b3.checkBalance();
        b3.withdraw(7000);
    }
}
