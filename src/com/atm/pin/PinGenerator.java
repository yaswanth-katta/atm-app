package com.atm.pin;

import com.atm.verification.BankVerification;

import java.util.Scanner;

public class PinGenerator {



    Scanner scanner=new Scanner(System.in);
    private int accountNumber,mobileNo,newPin;
    BankVerification bankVerification = new BankVerification();
    public void newPinGenerate(){
        System.out.println("Enter the your account number:");
        accountNumber=scanner.nextInt();
        boolean pinstatus=bankVerification.check_account(accountNumber);
        if(pinstatus){
            System.out.println("Enter your mobile number:");
            mobileNo=scanner.nextInt();
            boolean newpPinstatus=bankVerification.check_account(mobileNo);
            if(newpPinstatus){
                int p;
                System.out.println("Enter your new pin number:");
                newPin=scanner.nextInt();
                bankVerification.pinCheck(newPin);
                if(pinstatus){
                    System.out.println("New pin is succesfully generated\n");
                }else{System.out.println("This pin not generated!\nTry another pin number\n");}
            }else{System.out.println("please enter the valid mobile number!\nit must be linked with your account \n");}
        }else{
            System.out.println("Please enter the valid account number!\n");
            System.out.println("Thank you for using YASH ATM\n");
        }
    }
}
