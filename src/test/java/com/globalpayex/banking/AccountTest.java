package com.globalpayex.banking;

import com.globalpayex.banking.entities.AccType;
import com.globalpayex.banking.entities.Account;
import com.globalpayex.banking.exceptions.LowBalanceExeption;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    @Test
    void testBankOp(){
        var account=new Account(120, AccType.Savings,30000);
        var bal=account.deposit(10000);
        assertEquals(40000,bal);
        try{
            bal=account.withdraw(10000);
        }catch (LowBalanceExeption e){
            System.out.println(e.getMessage());
        }
        assertEquals(30000,bal);

        account
                .getDetails()
                .ifPresent(details-> System.out.println(details.toUpperCase()));


//        System.out.println(Account.getDetails().toUpperCase());
    }

    @Test
    void testEmptyAccount(){
        var account=new Account();
        assertEquals(0.0,account.getBalance());

//        account
//                .getDetails()
//                .ifPresent(details-> System.out.println(details.toUpperCase()));

        account
                .getDetails()
                .ifPresentOrElse(
                        details-> System.out.println(details.toUpperCase()),
                        ()-> System.out.println("account not initialized"));


//        String details=Account.getDetails();
//
//        //NULL POINTER CHECK
//        if(details != null){
//            System.out.println(details.toUpperCase());
//
//        }else{
//            System.out.println("account not intialized..");
//        }


    }

    @Test
    void negativeAmtWithdraw(){
        var account=new Account(120,AccType.Savings,30000);
        assertThrows(
                IllegalArgumentException.class,
                ()-> account.withdraw(-9000)
        );
    }

    @Test
    void lowBalance(){
        var account=new Account(120,AccType.Savings,5000);
        assertThrows(
                LowBalanceExeption.class,
                ()->account.withdraw(4500)
        );
    }
}