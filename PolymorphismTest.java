/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Loulyeta Al Arnaout
 */
public class PolymorphismTest
{


public static void main(String [] args)
 {
 // construct new SavingAccount object called abdalah
 SavingAccount abdalah = new SavingAccount(0.5);

 // construct new TimeDepositAccount object called flah
 TimeDepositAccount flah = new TimeDepositAccount(1,3);

 // construct new CheckingAccount object called baker
 CheckingAccount baker = new CheckingAccount(0);

 abdalah.deposit(10000);

 flah.deposit(10000);

 printBalance("abdalah ",abdalah);
 printBalance("flah ",flah);
 printBalance("baker ",baker);

 // transfer 1000Sr from abdalah to baker

 abdalah.transfer(baker,2000);

 // transfer 1000Sr from flah to baker

 flah.transfer(baker,980); 
printBalance("abdalah ",abdalah);
 printBalance("flah ",flah);
 printBalance("baker ",baker);


 baker.withdraw(500);
 printBalance("baker ",baker);
 baker.withdraw(80);
 printBalance("baker ",baker);
 baker.withdraw(400);
 printBalance("baker ",baker);

 endOfMonth(abdalah);
 endOfMonth(flah);
 endOfMonth(baker);
 printBalance("abdalah ",abdalah);
 printBalance("flah ",flah);
 printBalance("baker ",baker);
 }
public static void endOfMonth(SavingAccount savings)
 {savings.addInterest();
 }
public static void endOfMonth(CheckingAccount checking)
 {checking.deductFees();
 }
public static void printBalance(String name , BankAccount account)
 {System.out.println("The balance of " + name +
 "account is " + account.getBalance()+" SR");
 }
}
