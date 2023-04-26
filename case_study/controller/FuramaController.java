package case_study.controller;

import java.util.Scanner;

public class FuramaController {
    private final EmployeeManagementController employeeManagementController= new EmployeeManagementController();
    private final CustomerManagementController customerManagementController = new CustomerManagementController();
    private final FacilityManagementController facilityManagementController = new FacilityManagementController();
    private final BookingManagementController bookingManagementController = new BookingManagementController();
    private final PromotionManagementController promotionManagementController = new PromotionManagementController();
    public void displayMainMenu(){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("----Furama-Menu----\n" +
                    "1.Employee Management\n" +
                    "2.Customer Management\n" +
                    "3.Facility Management\n" +
                    "4.Booking Management\n" +
                    "5.Promotion Management\n" +
                    "6.Exit\n" +
                    "Enter Your Choice ");
            String choice = sc.nextLine();
            switch (choice){
                case "1":
                    employeeManagementController.displayMenuEmployee();
                    break;
                case "2":
                    customerManagementController.displayMenuCustomer();
                    break;
                case "3":
                    facilityManagementController.displayMenuFacility();
                    break;
                case "4":
                    bookingManagementController.displayMenuBooking();
                    break;
                case "5":
                    promotionManagementController.displayMenuPromotion();
                    break;
                case "6":
                    flag= false;
                    System.out.println("Exit Menu");
                    break;
                default:
                    System.out.println("Enter Your Choice Again");
                    break;
            }

        }while (flag);
    }
}
