package com.atm.banking;

import com.atm.verification.BankVerification;

import java.util.Scanner;

public class BankingService {


    Scanner scanner = new Scanner(System.in);
    BankVerification bankVerification = new BankVerification();
    public void bankingServices() {

        System.out.println("1. WITHDRAWL\t");
        System.out.println("2. BALANCE ENQUIRY\t");
        System.out.println("\n3. MINISTATEMENT\t");
        System.out.println("4. CREDIT\t");
        System.out.println("\n*********************************************************************");
        System.out.println("\nEnter the option number: ");

        int selectedBankingOption = scanner.nextInt();
        switch (selectedBankingOption) {
            case 1:
                withdrawlAmount();
                break;
            case 2:
                balanceEnquiry();
                break;

            case 3:
                displayMiniStatement();
                break;

            case 4:
                creditAmount();
                break;
            default:
                break;

        }
    }
    public void withdrawlAmount() {

        System.out.println("Enter your pin  number: ");
        int pinNo=scanner.nextInt();
        BankVerification bankVerification=new BankVerification();
        Boolean pinStatus =bankVerification.pinCheck(pinNo);
        if (pinStatus) {
            int available = 100000;
            System.out.println("Enter the money: ");
            int amount=scanner.nextInt();
            pinStatus = bankVerification.remainingBalance(amount);
            if (pinStatus){
                available -= amount;
                if (available >= 0) {
                    System.out.println("\nPlease collect your cash");
                    System.out.println("\nAvailable balance is : " +available);
                    System.out.println("\nThank you for using YASH ATM..\nVisit Again");

                } else {
                    System.out.println("Sorry!\nyou don't have sufficient money in your account");
                    System.out.println("available Balance is:"+available);
                    System.out.println("\nVisit again");
                }
            }
        }
    }
    void balanceEnquiry() {

        System.out.println("Enter your pin  number: ");
        int pin=scanner.nextInt();
        boolean pinStatus = bankVerification.pinCheck(pin);
        int available = 100000;
        if (pinStatus) {
            System.out.println("Available balance is:"+available);
            System.out.println("\nThank you for using YASH ATM");
        } else {
            System.out.println("Wrong pin number!\n");
        }
    }

    //TODO need to write logic here
    void displayMiniStatement(){
        System.out.println("Transaction One: ");
        System.out.println("Transaction Two: ");
        System.out.println("Transaction Three: ");
        System.out.println("Transaction Four: ");
        System.out.println("Transaction Five: ");
    }


    void creditAmount() {
        BankVerification bankVerification = new BankVerification();

        System.out.println("Enter your pin  number: ");
        int pin=scanner.nextInt();
        boolean pinStatus = bankVerification.pinCheck(pin);
        if (pinStatus) {
            System.out.println("Enter the amount to credit:");
            int credit_cash=scanner.nextInt();
            if (1 == bankVerification.creditAmountAvailabilty(credit_cash)) {
                System.out.println(""+credit_cash+ " Money is succesfully credited\n");
            }

        }

    }
}
