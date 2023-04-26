package case_study.controller;

import java.util.Scanner;

public class BookingManagementController {
    public void displayMenuBooking(){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("----Booking-Menu----\n" +
                    "1.Add New Booking\n" +
                    "2.Display List Booking\n" +
                    "3.Create New Contracts\n" +
                    "4.Display List Contracts\n" +
                    "5.Edit Contracts\n" +
                    "6.Return Main Menu\n" +
                    "Enter Your Choice...");
            String choice = sc.nextLine();
            switch (choice){
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    //return
                    flag= false;
                    System.out.println("Return Main Menu");
                    break;
                default:
                    System.out.println("Enter Your Choice Again...");
                    break;
            }
        }while (flag);
    }
}
