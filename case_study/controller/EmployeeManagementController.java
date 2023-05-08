package case_study.controller;

import case_study.repository.EmployeeRepository;
import case_study.service.EmployeeService;

import java.util.Scanner;

public class EmployeeManagementController {
    private EmployeeService employeeService = new EmployeeService();
    public void displayMenuEmployee(){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("----Employee-Menu----\n" +
                    "1.Display List Employee\n" +
                    "2.Add New Employee\n" +
                    "3.Edit Employee\n" +
                    "4.Return Main Menu\n" +
                    "Enter Your Choice...");
            String choice = sc.nextLine();
            switch (choice){
                case "1":
                    employeeService.displayEmployeeList();
                    //diplay
                    break;
                case "2":
                    employeeService.addNewEmployee();
                    //add
                    break;
                case "3":
                    employeeService.editEmployee();
                    //edit
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
