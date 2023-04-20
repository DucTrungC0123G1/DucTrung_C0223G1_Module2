package mvc_2.view;

import mvc_2.controller.StaffController;

public class StaffManager {
    public static void main(String[] args) {
        StaffController staffController =new StaffController();
        staffController.showStaff();
    }
}
