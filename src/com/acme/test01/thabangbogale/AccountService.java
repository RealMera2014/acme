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
public interface AccountService {

 public double getBalance();

 public void deposit(double amontToDeposit) throws AccountNotFoundException;

  // void withdraw(double amontToWithdraw) throws AccountNotFoundException, WithdrawalAmountTooLargeException;
  public void openSavingsAccount(Long accountid, Long amontToDeposit);

  public void withdraw(Long accountid, Long amontToWithdraw) throws AccountNotFoundException, WithdrawalAmountTooLargeException;

  public void openCurrentAccount(Long accountid);
//  public void deposit(Long accountid, int amontToDeposit) throws AccountNotFoundException;
}
