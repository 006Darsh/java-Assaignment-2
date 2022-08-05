// Name :- Aswani Darsh
// Roll-no :-21ce006
// Aim :-(Subclasses of Account) In Programming Exercise 2, the Account class was
// defined to model a bank account. An account has the properties account number,
// balance, annual interest rate, and date created, and methods to deposit and 
// withdraw funds. Create two subclasses for checking and saving accounts. A 
// checking account has an overdraft limit, but a savings account cannot be 
// overdrawn. Draw the UML diagram for the classes and then implement them. 
// Write a test program that creates objects of Account, SavingsAccount, and
// CheckingAccount and invokes their toString() methods.
// Git-hub repository: https://github.com/006Darsh/java-Assaignment-2
package Darsh2_4;
import java.util.Scanner;

import Darsh2_2.*;
public class Darsh2_4main {
    public static void main(String[] args) {
        Account account = new Account(111, 200,"06-11-2003");
        System.out.println("simple account");
        System.out.println(account);
        System.out.println("--------------------------------------------------------------------------------------");
        CheckingAccount checkingAccount = new CheckingAccount(112, 250,"05-11-2003");
        System.out.println("Checking account");
        System.out.println(account);
        System.out.println("Enter ammount for withdrawing in checking account  :");
        Scanner s = new Scanner(System.in);
        double ammount = s.nextDouble();
        checkingAccount.withdraw(ammount);
        System.out.println(checkingAccount);
        SavingsAccount savingsAccount = new SavingsAccount(113, 10000,"04-11-2003");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Saving account");
        System.out.println(account);
        System.out.println("Enter ammount for withdrawing in saving account  :");
        double ammounts = s.nextDouble();
        savingsAccount.withdraw(ammounts);
        System.out.println(savingsAccount);
    }
}
