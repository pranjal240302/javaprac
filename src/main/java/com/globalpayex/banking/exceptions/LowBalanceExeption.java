package com.globalpayex.banking.exceptions;

public class LowBalanceExeption extends Exception{
    public LowBalanceExeption(String message){
        super(message);
    }
}
