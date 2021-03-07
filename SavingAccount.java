/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Loulyeta Al Arnoaut
 */
public class SavingAccount extends BankAccount {
    public SavingAccount(double rate)
 {
 interestRate = rate;
 }
// addInterest method
public void addInterest()
 {
 double interest = getBalance()*interestRate/100;
 deposit(interest);
 }
// The SavingAccount instance variable
private double interestRate; 

    
}
