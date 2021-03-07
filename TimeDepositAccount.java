/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Loulyeta Alarnaout
 */
public class TimeDepositAccount extends SavingAccount
// The TimeDepositAccount constructor
{
public TimeDepositAccount(double rate , int maturity)
 {
 super (rate);
 periodsToMaturity = maturity;
 }
// override the SavingAccount addInterest method
public void addInterest()
 {
 periodsToMaturity--;
 super.addInterest();
 }
// override the BankAccount withdraw method
public void withdraw(double amount)
 {
 if (periodsToMaturity >0)
 super.withdraw(EARLY_WITHDRAW_PENALITY);
 // now subtract amount from balance
 super.withdraw(amount);
 }
// The TimeDepositAccount instance variables
private int periodsToMaturity;
private static final double EARLY_WITHDRAW_PENALITY = 20.0;
} 
