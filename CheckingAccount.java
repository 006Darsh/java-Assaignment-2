package Darsh2_4;
import Darsh2_2.*;
public class CheckingAccount extends Account {
    protected double OVERDRAFT_LIMIT = -100;

    public CheckingAccount(int id, double balance,String date) {
        super(id, balance,date);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= OVERDRAFT_LIMIT) {
            super.withdraw(amount);
        }
        else
        System.out.println("Over drawing is passing the given limit  :");
    }

    @Override
    public String toString() {
        return "CheckingAccount{"+ "mBalance=" + balance +'}';
    }
}

