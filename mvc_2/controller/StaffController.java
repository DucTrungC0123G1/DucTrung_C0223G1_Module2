package mvc_2.controller;

import mvc_2.service.StaffService;

import java.util.Scanner;

public class StaffController {
    Scanner sc = new Scanner(System.in);
    StaffService staffService = new StaffService();
     public void showStaff(){
         System.out.println("----Staff-Manager----");
         boolean flag = true;
         do {
             System.out.println("Chose selection:\n" +
                     "1. Add New Staff\n" +
                     "2. Display All Staff\n" +
                     "3. Edit Staff\n" +
                     "4. Delete Staff\n" +
                     "5. Exit");
             String chose = sc.nextLine();
             switch (chose){
                 case "1":
                     break;
                 case "2":
                     break;
                 case "3":
                     break;
                 case "4":
                     break;
                 case "5":
                     System.exit(0);
                     break;
                 default:
                     System.out.println("Don't Have Your Choice");
             }

         }while (flag);
     }


}
