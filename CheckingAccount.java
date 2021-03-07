/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Loulyeta Al Arnaout
 */
public class CheckingAccount extends BankAccount
// The CheckingAccount constructor
{
public CheckingAccount(double initialBalance)
 {
 // construct superclass
 super(initialBalance);
 // initialize transaction count
 transactionCount = 0;
 }
// overide the BankAccount deposit method
public void deposit(double amount)
 {
 transactionCount ++;
 // now add amount to balance
 super.deposit(amount);
 }
// overide the BankAccount withdraw method
public void withdraw(double amount)
 {
 transactionCount ++;
 // now subtract amount from balance
 super.withdraw(amount);
 }
// New method deductFees
public void deductFees()
 {
 if(transactionCount>FREE_TRANSACTIONS)
 { double fees =
TRANSACTION_FEE*(transactionCount- FREE_TRANSACTIONS);
 super.withdraw(fees);
 }
 transactionCount = 0;

 }
// The CheckingAccount instance variables
private int transactionCount;
private static final int FREE_TRANSACTIONS = 3;
private static final double TRANSACTION_FEE = 2.0;
}