package com.atm.transer;

import com.atm.verification.BankVerification;

import java.util.Scanner;

public class TransferAmount {


    Scanner scanner=new Scanner(System.in);
    private int pin;
    private int atm_number;
    BankVerification bankVerification = new BankVerification();
    public void transferMoney(){

        System.out.println("Enter pin number:");
        pin=scanner.nextInt();

        boolean pinStatus=bankVerification.pinCheck(pin);
        if(pinStatus){
            System.out.println("Enter tranfered ATM number:");
            int atm_number=scanner.nextInt();

            boolean pinstatus=bankVerification.check_account(atm_number);
            if (pinstatus){
                int trans_amount;
                System.out.println("Enter the amount:");
                trans_amount=scanner.nextInt();
                System.out.println(""+ trans_amount +"  cash is succesfully transfered\n");
                System.out.println("Thanks for using YASH ATM\n");
            }else{System.out.println("Please enter the valaid ATM number\nThanks for using YASH ATM\n");}

        }else{
            System.out.println("Please enter the valid pin number!\n");
        }
    }
}
