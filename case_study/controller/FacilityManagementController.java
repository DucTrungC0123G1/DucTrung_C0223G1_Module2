package case_study.controller;

import java.util.Scanner;

public class FacilityManagementController {
    public void displayMenuFacility(){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("----Facility-Menu----\n" +
                    "1.Display List Facility\n" +
                    "2.Add New Facility\n" +
                    "3.Display List Facility Maintenance\n" +
                    "4.Return Main Menu\n" +
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
