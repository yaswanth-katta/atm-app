import com.atm.banking.BankingService;
import com.atm.banking.BankingServiceInfo;
import com.atm.pin.PinChange;
import com.atm.pin.PinGenerator;
import com.atm.transer.TransferAmount;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        boolean flag=true;
        while(flag) {

            System.out.print(" 1.How to use the YASH ATM\n");
            System.out.print("2. BANKING\t3. PIN GENERATE\t");
            System.out.print("\n4. PIN CHANGE\t5. TRANSFER\n");
            System.out.println("        6.EXIT\n");
            System.out.print("\n**********************************************************");
            System.out.print("\nEnter the option number: ");
            Scanner input = new Scanner(System.in);
            int selectedService = input.nextInt();
            switch (selectedService) {
                case 1:
                    BankingServiceInfo service = new BankingServiceInfo();
                    service.atmServicesInfo();
                    break;
                case 2:
                    BankingService banking = new BankingService();
                    banking.bankingServices();
                    break;

                case 3:
                    PinGenerator pinGenerate = new PinGenerator();
                    pinGenerate.newPinGenerate();
                    break;

                case 4:
                    PinChange pinchange = new PinChange();
                    pinchange.pinChanging();
                    break;

                case 5:
                    TransferAmount transfer = new TransferAmount();
                    transfer.transferMoney();
                    break;

                case 6:
                    flag=false;
                    System.out.println("Thank you for using yash ATM");
                    System.out.println("Visit again...");
                    break;

                default:
                    System.out.println("Select any one of the Service from above displayed options");

            }
        }
    }
}
