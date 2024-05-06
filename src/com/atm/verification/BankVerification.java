package com.atm.verification;

/**
 * Created by venu singh katta on 8/30/2019.
 */
public class BankVerification {


    public BankVerification(){

    }
    public boolean pinCheck(int pinno) {
        boolean flag = false;
        int remainder, remainder2, count = 0;

        while (pinno != 0) {
            remainder = pinno % 10;
            pinno = pinno / 10;
            remainder2 = pinno % 10;
            if (remainder > remainder2) {
                count++;
            }
        }

        if (count == 4) {
            flag = true;
        }
        return flag;
    }


    public boolean remainingBalance(int amount) {
        boolean flag=true;
        if (amount > 40000) {
            System.out.println("\n\nSorry! please enter the amount below 40000 ");
            System.out.println("\nthank you for using YASH ATM");
            flag=false;
        }
        return flag;
    }

    //Account number checking
    public boolean check_account(int account_number) {
        int count = 0;
        boolean flag = false;
        while (account_number != 0) {
            account_number = account_number / 10;
            count++;
        }
        if (count == 16) {
            flag = true;
        }
        return flag;
    }

    public int creditAmountAvailabilty(int credit_money) {
        int credit_amount = credit_money;
        do {
            if (credit_amount <= 40000&&credit_amount>0) {
                System.out.println("place the "+credit_amount+" money");
                break;
            } else {
                System.out.println("place money 40000");
                credit_amount = credit_amount - 40000;
            }
        } while (credit_amount != 0);

        return 1;
    }
}
