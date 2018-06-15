package com.acme.test01.thabangbogale;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MTBogale
 */
public class TestACME {
   public static void main(String s[]) throws AccountNotFoundException, WithdrawalAmountTooLargeException
    {
 
        AccountService account = (AccountService) new SavingsAccount();
    
        System.out.println("Transacting using Savings Account");
        TransactionForEach(account);
        System.out.println();
    
        account = (AccountService) new CurrentAccount();
    
        System.out.println("Transactions on Current Account");
        TransactionForEach(account);
    }
    
    public static void TransactionForEach(AccountService account) throws AccountNotFoundException, WithdrawalAmountTooLargeException
    {
       
      try{
      System.out.println("*********************************: "+account.getBalance());
       // account.deposit(10000.0);
       
        printBalance("depositing R30,000.0", account);
        account.withdraw(01L,2500L);
        printBalance("withdrawing R3,000.0", account);
        account.withdraw(0L,4100L);
        printBalance("withdrawing R6,800.0", account);
        account.deposit(5000.0);
        printBalance("depositing R9,000.0", account);
        System.out.println("***********************************");
      }catch(AccountNotFoundException | WithdrawalAmountTooLargeException e){
       System.out.println("*********_______*******"+e);
      }
      
      }
    
    public static void printBalance(String message, AccountService account)
    {
        System.out.println("The balance after " + message + " is = R"+ account.getBalance() +".");
    }

}

