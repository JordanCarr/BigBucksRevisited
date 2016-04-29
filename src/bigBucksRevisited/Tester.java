/*
 * Copyright 2016 Jordan Carr
 */

package bigBucksRevisited;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Tester {
    /**
     * Takes the program BigBucks and changes a bunch of things into iterators.
     * @param args There are no args for this program
     */
    public static void main(String args[]) {
        {
            NumberFormat formatter = NumberFormat.getNumberInstance();
            formatter.setMinimumFractionDigits(2);
            formatter.setMaximumFractionDigits(2);
            String name;
            //noinspection MismatchedQueryAndUpdateOfCollection
            ArrayList<BankAccount> aryLst = new ArrayList<>();
            ListIterator<BankAccount> iter = aryLst.listIterator();

            do {
                Scanner kbReader = new Scanner(System.in);
                System.out.print("Please enter the name to whom the account belongs. (\"Exit\" to abort) ");
                name = kbReader.nextLine();
                if (!name.equalsIgnoreCase("EXIT")) {
                    System.out.print("Please enter the amount of the deposit. ");
                    double amount = kbReader.nextDouble();
                    System.out.println(" ");
                    BankAccount theAccount = new BankAccount(name, amount);
                    iter.add(theAccount);
                }
            } while (!name.equalsIgnoreCase("EXIT"));

            BankAccount ba = iter.previous();
            double maxBalance = ba.balance;
            String maxName = ba.name;
            while (iter.hasPrevious()) {
                BankAccount tmp = iter.previous();
                double tmpBalance = tmp.balance;
                String tmpName = tmp.name;
                if (Math.abs(tmpBalance) > Math.abs(maxBalance)) {
                    maxBalance = tmpBalance;
                    maxName = tmpName;
                }
            }
            System.out.println(" ");
            System.out.println("The account with the largest balance belongs to " + maxName + ".");
            System.out.println("The amount is $" + formatter.format(maxBalance) + ".");
        }
    }
}
