/*
 * Copyright 2016 Jordan Carr
 * File: BankAccount.java
 * Class: bigBucksRevisited.BankAccount
 */

package bigBucksRevisited;

class BankAccount {
    private double balance;

    /**
     * @param nm
     * @param amt
     */
    public BankAccount(String nm, double amt) {
        String name = nm;
        balance = amt;
    }

    public void deposit(double dp) {
        balance = balance + dp;
    }

    public void withdraw(double wd) {
        balance = balance - wd;
    }
}
