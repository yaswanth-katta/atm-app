package com.atm.pin;

import com.atm.verification.BankVerification;

import java.util.Scanner;

public class PinChange {

    Scanner scanner=new Scanner(System.in);
    BankVerification bankVerification = new BankVerification();
    public void pinChanging(){

        System.out.println("Enter pin number:");
        int pin=scanner.nextInt();
        boolean pinStatus=bankVerification.pinCheck(pin);
        if(pinStatus){
            int new_pin;
            System.out.println("Enter new pin number:");
            new_pin = scanner.nextInt();
            boolean pinstatus=bankVerification.pinCheck(new_pin);
            if(pinStatus) System.out.println("your pin is succesfully generated\n");
            else System.out.println("Your pin is not generated!\n");
        }
    }


}


