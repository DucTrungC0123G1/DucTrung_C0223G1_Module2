package case_study.controller;

import case_study.service.CustomerService;

import java.util.Scanner;

public class CustomerManagementController {
    CustomerService customerService = new CustomerService();
    public void displayMenuCustomer(){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("----Customer-Menu----\n" +
                    "1.Display List Customer\n" +
                    "2.Add New Customer\n" +
                    "3.Edit Customer\n" +
                    "4.Return Main Menu\n" +
                    "Enter Your Choice...");
            String choice = sc.nextLine();
            switch (choice){
                case "1":
                    customerService.displayCustomer();
                    //display
                    break;
                case "2":
                    customerService.addNewCustomer();
                    //add
                    break;
                case "3":
                    customerService.editCustomer();
                    //edit
                    break;
                case "4":
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
