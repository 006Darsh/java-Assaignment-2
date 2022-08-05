package Darsh2_4;
import Darsh2_2.*;
public class SavingsAccount extends Account {
    protected double OVERDRAFT_LIMIT = 0;

    public SavingsAccount(int id, double balance,String date) {
        super(id, balance, date);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= OVERDRAFT_LIMIT || balance - amount <= OVERDRAFT_LIMIT) 
            super.withdraw(amount);
        }
    

    @Override
    public String toString() {
        return "SavingsAccount{" + "net Balance =" + balance +'}';
    }
}
