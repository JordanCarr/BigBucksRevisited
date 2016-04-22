/*
 * Copyright 2016 Jordan Carr
 * File: Tester.java
 * Class: bigBucksRevisited.Tester
 */

package bigBucksRevisited;

import java.io.*;
import java.util.*;
import java.text.*; //for NumberFormat

public class Tester {
    /**
     *
     * @param args There are no args for this program
     */
    public static void main(String args[]) {
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMinimumFractionDigits(2);
        formatter.setMaximumFractionDigits(2);
        String name;
        ArrayList aryLst = new ArrayList();
        /*Create a ListIterator object called iter*/
        do {
            Scanner kbReader = new Scanner(System.in);
            System.out.print("Please enter the name to whom the account belongs. (\"Exit\" to abort) ");
            name = kbReader.nextLine();
            if (!name.equalsIgnoreCase("EXIT")) {
                System.out.print("Please enter the amount of the deposit. ");
                double amount = kbReader.nextDouble();
                System.out.println(" "); //gives an eye pleasing blank line between accounts
                BankAccount theAccount = new BankAccount(name, amount);
                /*Use iter to add theAccount to the list*/
            }
        } while (!name.equalsIgnoreCase("EXIT"));
//Search aryLst and print out the name and amount of the largest bank account
        BankAccount ba = /*use iter to get the last bank account in the list*/
        //double maxBalance = ba.balance; //set last account as winner so far
        //String maxName = ba.name;
       // while (/*use iter to see if we should continue looping*/) {
            /*Step through all objects and decide which has the largest balance*/
        //}
        System.out.println(" ");
        System.out.println("The account with the largest balance belongs to " + maxName + ".");
        System.out.println("The amount is $" + formatter.format(maxBalance) + ".");
    }
}
