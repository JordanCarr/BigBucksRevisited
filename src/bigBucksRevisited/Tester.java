/*
 * Copyright 2016 Jordan Carr
 * File: Tester.java
 * Class: bigBucksRevisited.Tester
 */

package bigBucksRevisited;

import java.util.*;
import java.text.*; //for NumberFormat

public class Tester {
    /**
     * @param args There are no args for this program
     */
    public static void main(String args[]) {
        {
            NumberFormat formatter = NumberFormat.getNumberInstance( );
            formatter.setMinimumFractionDigits(2);
            formatter.setMaximumFractionDigits(2);
            String name;
            ArrayList<BankAccount> aryLst = new ArrayList<>( );
            ListIterator<BankAccount> iter = aryLst.listIterator();
            do
            {
                Scanner kbReader = new Scanner(System.in);
                System.out.print("Please enter the name to whom the account belongs. (\"Exit\" to abort) ");
                name = kbReader.nextLine( );
                if( !name.equalsIgnoreCase("EXIT") )
                {
                    System.out.print("Please enter the amount of the deposit. ");
                    double amount = kbReader.nextDouble( );
                    System.out.println(" "); //gives an eye pleasing blank line between accounts
                    BankAccount theAccount = new BankAccount(name, amount);
                    aryLst.add(theAccount);
                }
            }while(!name.equalsIgnoreCase("EXIT")); //Search aryLst and print out the name and amount of the largest
            // bank account
            BankAccount ba = aryLst.get(aryLst.size() - 1);
            double maxBalance = ba.balance; //set last account as winner so far
            String maxName = ba.name;
            while(iter.hasNext())
            {
                /* help here please*/
                if (iter.next().balance > iter.previous().balance) {
                    maxBalance = iter.next().balance;
                    maxName = iter.next().name;
                }
            }
            System.out.println(" ");
            System.out.println("The account with the largest balance belongs to " + maxName + ".");
            System.out.println("The amount is $" + formatter.format(maxBalance) + ".");
        }
    }
}
