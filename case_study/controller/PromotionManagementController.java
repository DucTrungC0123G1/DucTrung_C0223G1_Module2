package case_study.controller;

import java.util.Scanner;

public class PromotionManagementController {
    public void displayMenuPromotion(){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("----Promotion-Menu----\n" +
                    "1.Display List Customers Use Service\n" +
                    "2.Display List Customers Get Voucher\n" +
                    "3.Return Main Menu\n" +
                    "Enter Your Choice...");
            String choice = sc.nextLine();
            switch (choice){
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    //return
                    flag = false;
                    System.out.println("Return Main Menu");
                    break;
                default:
                    System.out.println("Enter Your Choice Again...");
                    break;
            }


        }while (flag);
    }
}
