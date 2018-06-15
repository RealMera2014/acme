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
public class CurrentAccount implements AccountService
{
    private double balance = 2000;

    public double getBalance()
    {
        return balance;
    }

    @Override
    public void deposit(double amount)
    {
        balance += amount;
    }

    public void withdraw(double amount)
    {
        balance -= amount;
    }

  @Override
  public void openSavingsAccount(Long accountid,Long amontToDeposit) {
    if (accountid>0)
    {
    
    balance += amontToDeposit;
    } //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void openCurrentAccount(Long accountid) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void withdraw(Long accountid, Long amontToWithdraw) throws AccountNotFoundException, WithdrawalAmountTooLargeException {
    balance -= amontToWithdraw; //To change body of generated methods, choose Tools | Templates.
  }
}