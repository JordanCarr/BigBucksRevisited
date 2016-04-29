/*
 * Copyright 2016 Jordan Carr
 * File: BankAccount.java
 * Class: bigBucksRevisited.BankAccount
 */

package bigBucksRevisited;

class BankAccount {

    public BankAccount(String nm, double amt) {
        name = nm;
        balance = amt;
    }

    public void deposit(double dp) {
        balance = balance + dp;
    }

    public void withdraw(double wd) {
        balance = balance - wd;
    }

    public String name;
    public double balance;
}

