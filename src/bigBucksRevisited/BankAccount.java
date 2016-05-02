/*
 * Copyright 2016 Jordan Carr
 * Project Name: BigBucksRevisited
 * Class Name: bigBucksRevisited.BankAccount
 * Last Modification Date: 01/05/16 7:26 PM
 */

package bigBucksRevisited;

class BankAccount {

    final String name;
    double balance;

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
}