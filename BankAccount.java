/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Loulyeta Al Arnaout
 */
public class BankAccount {
    public BankAccount()
 {
 balance = 0;
 }
 // The second constructor sets balance to initial to initial balance
 public BankAccount(double initialBalance)
 {
 balance = initialBalance;
}
 // The deposit method adds an amount to instance variable balance
 public void deposit(double amount)
 {
 balance = balance + amount;
 }
 // The withdraw method subtracts an amount from instance variable balance
public void withdraw(double amount)
{
 balance = balance - amount;
 }
 // The transfer method withdraw an amount from this object and deposit to

 public void transfer(BankAccount other , double amount)
 {
 withdraw(amount);
other.deposit(amount);
}

 // The getBalance method returns the current balance
 public double getBalance()
 {
 return balance;
 }
 // The instance variable balance
private double balance;
 }
    


