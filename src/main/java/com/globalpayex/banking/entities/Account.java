package com.globalpayex.banking.entities;

import com.globalpayex.banking.exceptions.LowBalanceExeption;

import java.util.Optional;

public class Account {
    private int accNo;
    private AccType accType;
    private double balance;

    public static final String ACCTYPE_SAVINGS="Savings";
    public static final String ACCTYPE_CURRENT="Current";

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public int getAccNo() {
        return accNo;
    }

    public AccType getAccType() {
        return accType;
    }

    public void setAccType(AccType accType) {
//        if(accType.equals(Account.ACCTYPE_SAVINGS) || accType.equals(Account.ACCTYPE_CURRENT)){
//            this.accType = accType;
//        }

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {

        this.balance = balance;
    }


    public Account(){

    }

    public Account(int accNo, AccType accType, double balance) {
        this.accNo = accNo;
        this.accType = accType;
        this.balance = balance;
    }

    public double withdraw(double withdrawMoney) throws LowBalanceExeption{
        System.out.println("Transaction Starts...");

        try {
            if (withdrawMoney <= 0) {
                // thrwoinf exaception
                throw new IllegalArgumentException("amot passed need to be positive");
            }
            if (this.balance - withdrawMoney < 1000) {
//            throw new IllegalStateException("minimum account balance ");
                throw new LowBalanceExeption("minimum account balance ");
            }
            this.balance = this.balance - withdrawMoney;
            return this.balance;
        } finally {
            System.out.println("Transaction ends...");
        }
    }

    public double deposit(double depoMoney){
     this.balance=this.balance+depoMoney;
     return this.balance;
    }

    public Optional<String> getDetails(){

        if(this.accNo==0){
            return Optional.empty();
        }
        return Optional.of(String.format(
                    "Acc No: %s\nAcc Type: %s\nBalance: %s",
                    this.accNo,
                    this.accType,
                    this.balance
            ));
        }


    @Override
    public String toString() {
        return "BankOps{" +
                "accNo=" + accNo +
                ", accType='" + accType + '\'' +
                ", balance=" + balance +
                '}';
    }

}
