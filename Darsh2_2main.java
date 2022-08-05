// Name :- Aswani Darsh
// • A private double data field named balance for the account (default 500₹).
// • A private double data field named annualInterestRate that stores the current
// interest rate (default 7%). Assume all accounts have the same interest rate.
// • A private Date data field named dateCreated that stores the date when the
// account was created.
// • A no-arg constructor that creates a default account.
// • A constructor that creates an account with the specified id and initial balance.
// • The accessor and mutator methods for id, balance, and annualInterestRate.
// • The accessor method for dateCreated.
// • A method named getMonthlyInterestRate() that returns the monthly interest rate.
// • A method named getMonthlyInterest() that returns the monthly interest.
// • A method named withdraw that withdraws a specified amount from the account.
// • A method named deposit that deposits a specified amount to the account.
// Roll-no :-21ce006
// Aim :-Design a class named Account that contains:
// • A private int data field named id for the account (default 0).
// Git-hub repository: https://github.com/006Darsh/java-Assaignment-2
package Darsh2_2;
import java.util.*;

public class Darsh2_2main {
    public static void main(String[] args) {
        System.out.println("An example for you to to create a proper account :");
        Account d2_1 =new Account();
        d2_1.Accessor();
        Scanner s = new Scanner(System.in);
        
        int id;
        double balance,withdraw,deposit,monintrate,monint;
        String date;
        System.out.println("Enter the Account number of your account  :");
        id = s.nextInt();
        System.out.println("Enter the initial balance your account  :");
        balance = s.nextDouble();
        System.out.println("Enter the date at which you created your account  :");
        date = s.next();
        
        Account d2_2 = new Account(id, balance, date);
        d2_2.Accessor();
        monintrate = d2_2.getMonthlyInterestRate();
        monint = d2_2.getMonthlyInterest();
        System.out.println("Bank give "+monintrate+"% monthly intrest rate.");
        System.out.println("Your monthly intrest is "+monint+" Rupees");
        int i;

        System.out.println("Enter 1 to withdraw and 2 to deposit.");
        i = s.nextInt();
        switch(i)
        {
            case 1 :
            {
                System.out.println("Enter amount to be withdrawn  :");
                withdraw = s.nextDouble();
                d2_2.withdraw(withdraw);
                System.out.println("The amount remained in your account after withdrawal is   :"+d2_2.balance);
                break;
            }
            case 2 :
            {
                System.out.println("Enter amount to be deposited  :");
                deposit = s.nextDouble();
                balance = d2_2.deposit(deposit);
                System.out.println("The amount remained in your account after deposit is   :"+balance);
                break;
            }
            default :
            {
                System.out.println("You have changed anything  :");
                break;
            }
        }
        System.out.println("Your account afer withdrawal or deposit  :");
        d2_2.Accessor();

        int p=1;
        while(p==1)
        {
            System.out.println("Enter 1 use another account and 2 to not.");
            i = s.nextInt();
            if(i==1)
            {
                System.out.println("Enter the Account number of your account  :");
                id = s.nextInt();
                System.out.println("Enter the initial balance your account  :");
                balance = s.nextDouble();
                System.out.println("Enter the date at which you created your account  :");
                date = s.next();

                d2_2.mutator(id, balance, date);
                d2_2.Accessor();
                monintrate = d2_2.getMonthlyInterestRate();
                monint = d2_2.getMonthlyInterest();
                System.out.println("Bank give "+monintrate+"% monthly intrest rate.");
                System.out.println("Your monthly intrest is "+monint+" Rupees");
                System.out.println("Enter 1 to withdraw and 2 to deposit.");
                i = s.nextInt();
                
                switch(i)
                {
                    case 1 :
                    {
                        System.out.println("Enter amount to be withdrawn  :");
                        withdraw = s.nextDouble();
                        d2_2.withdraw(withdraw);
                        System.out.println("The amount remained in your account after withdrawal is   :"+d2_2.balance);
                        break;
                    }
                    case 2 :
                    {
                        System.out.println("Enter amount to be deposited  :");
                        deposit = s.nextDouble();
                        balance = d2_2.deposit(deposit);
                        System.out.println("The amount remained in your account after deposit is   :"+balance);
                        break;
                    }
                    default :
                    {
                        System.out.println("You have changed anything  :");
                        break;
                    }
                }
            }
            else 
            {
                System.out.println("--------------thanks for coming---------------------");
                break;
            }
        }
    }
}
