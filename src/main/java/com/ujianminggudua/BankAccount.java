package com.ujianminggudua;

public class BankAccount {

    int acc_no;
    String name;
    double amount;

    public void setAccount(int a, String n, double amt) {
        acc_no = a;
        name = n;
        amount = amt;
    }

    public double deposit(double amt) {
        amount = amount + amt;
        System.out.println(amt + " deposited");
        return amount;
    }


    public double withdraw(double amt) {
        if (amount < amt) {
            System.out.println("Insufficient Balance");
        } else {
            amount = amount - amt;
            System.out.println(amt + " withdrawn");
        }
        return amount;
    }

    public void checkBalance(double hasil) {
        System.out.println("Balance is: " + amount);
    }

    public void display(int acc_no, String name, double hasil) {
        System.out.println(this.acc_no + " " + this.name + " " + amount);
    }
}
