package case_study.service;

import case_study.model.person.Employee;
import case_study.repository.EmployeeRepository;
import case_study.ultils.EmployeeValidate;

import javax.sound.midi.Soundbank;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    Scanner sc = new Scanner(System.in);
    private EmployeeRepository employeeRepository = new EmployeeRepository();


    @Override
    public void displayEmployeeList() {
        List<Employee> employeeList = employeeRepository.getEmployeeList();
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }

    @Override
    public void addNewEmployee() {
        //String name, String birthDay, boolean gender, int cardID, int phone, String email, String employeeLevel,
        //String position, double salary
        String nameEmployee;
        do {
            System.out.println("Enter Name Employee");
            nameEmployee = sc.nextLine();
        } while (!EmployeeValidate.checkEmployeeName(nameEmployee));

        System.out.println("Enter BirthDay Employee");
        String birthDayEmployee = sc.nextLine();

        String choiceGender;
        boolean flag = true;
        boolean gender = false;
        do {
            System.out.println("Chose Gender\n" +
                    "1.Man\n" +
                    "2.Women\n");
            choiceGender = sc.nextLine();
            if (choiceGender.trim().equals("1")) {
                gender = true;
                flag = false;
            } else if (choiceGender.trim().equals("2")) {
                gender = false;
                flag = false;
            } else {
                System.out.println("Chose Again");
                flag = true;
            }
        } while (flag);

        String employeeCitizenCode;
        do {
            System.out.println("Enter Employee CitizenCode");
            employeeCitizenCode = sc.nextLine();
        } while (!EmployeeValidate.checkEmployeeCitizenCode(employeeCitizenCode));

        String employeePhone;
        do {
            System.out.println("Enter Phone Employee");
            employeePhone = sc.nextLine();
        } while (!EmployeeValidate.checkEmployeePhone(employeePhone));
        Long employeePhone1 = Long.parseLong(employeePhone);

        String employeeEmail;
        do {
            System.out.println("Enter Email Employee");
            employeeEmail = sc.nextLine();
        } while (!EmployeeValidate.checkEmployeeMail(employeeEmail));

        String employeeLevel = "";
        boolean flaglevel = true;
        do {
            System.out.println("Enter Level Employee\n" +
                    "1. Intermediate\n" +
                    "2. College\n" +
                    "3. University\n" +
                    "4. After University\n");
            String choiceLv = sc.nextLine();
            switch (choiceLv) {
                case "1":
                    employeeLevel = "Intermediate";
                    flaglevel = false;
                    break;
                case "2":
                    employeeLevel = "College";
                    flaglevel = false;
                    break;
                case "3":
                    employeeLevel = "University";
                    flaglevel = false;
                    break;
                case "4":
                    employeeLevel = "After University";
                    flaglevel = false;
                    break;
                default:
                    System.out.println("Enter Wrong Information");
                    flaglevel = true;
                    break;
            }
        } while (flaglevel);

        System.out.println("Enter Position Employee");
        String positionEmployee = sc.nextLine();
        System.out.println("Enter Salary Employee");
        double employeeSalary = Double.parseDouble(sc.nextLine());
        String employeeCardID;
        do {
            System.out.println("Enter CardID Employee");
            employeeCardID = sc.nextLine();
        } while (!EmployeeValidate.checkEmployeeID(employeeCardID));


        Employee newEmployee = new Employee(nameEmployee, birthDayEmployee, gender, employeeCitizenCode, employeePhone1, employeeEmail,
                employeeLevel, positionEmployee, employeeSalary, employeeCardID);
        employeeRepository.addNewEmployee(newEmployee);
        System.out.println("ADD New Employee Success");
    }

    @Override
    public void editEmployee() {
        String idEmployee;
//        EmployeeService employeeService = new EmployeeService();
        displayEmployeeList();
        System.out.println("Enter ID To Edit Employee");
        idEmployee = sc.nextLine();
//        employeeRepository.findIDEmployee(idEmployee);
        Employee employee = employeeRepository.findIDEmployee(idEmployee);
        if (employee != null) {
            boolean flag = true;
            do {
                System.out.println("Choice Information Employee To Edit\n" +
                        "1. Edit ID\n" +
                        "2. Edit Name\n" +
                        "3. Edit Birthday\n" +
                        "4. Edit Gender\n" +
                        "5. Edit CitizenCode\n" +
                        "6. Edit Phone\n" +
                        "7. Edit Email\n" +
                        "8. Edit Level\n" +
                        "9. Edit Position\n" +
                        "10. Edit Salary\n" +
                        "11. Return Menu");
                String choice = sc.nextLine();
                switch (choice) {
                    case "1":
                        String editID;
                        do {
                            System.out.println("Enter Edit ID");
                            editID = sc.nextLine();
                            if (!EmployeeValidate.checkEmployeeID(editID)) {
                                System.out.println("Type ID NV-xxxx");

                            }
                        } while (!EmployeeValidate.checkEmployeeID(editID));
                        employee.setCardID(editID);
                        employeeRepository.editEmployee(editID, employee);
                        break;
                    case "2":
                        String editName;
                        do {
                            System.out.print("Enter Edit Name ");
                            editName = sc.nextLine();
                            if (!EmployeeValidate.checkEmployeeName(editName)) {
                                System.out.println("Type Name Abc");
                            }
                        } while (!EmployeeValidate.checkEmployeeName(editName));
                        employee.setName(editName);
                        employeeRepository.editEmployee(editName, employee);
                        break;
                    case "3":
                        String editBirthday;
                        do {
                            System.out.println("Enter Edit Birthday");
                            editBirthday = sc.nextLine();
                            if (!EmployeeValidate.checkEmployeeBirthday(editBirthday)) {
                                System.out.println("Type Birthday: xx/xx/xxxx");
                            }
                        } while (!EmployeeValidate.checkEmployeeBirthday(editBirthday));
                        employee.setBirthDay(editBirthday);
                        employeeRepository.editEmployee(editBirthday, employee);
                        break;
                    case "4":
                        String genderEdit;
                        boolean flag2 = true;
                        boolean gender2 = false;
                        do {
                            System.out.println("Enter Edit Gender\n" +
                                    "1.Male\n" +
                                    "2.Female\n");
                            genderEdit = sc.nextLine();
                            if (genderEdit.trim().equals("1")) {
                                flag2 = false;
                                gender2 = true;
                            } else if (genderEdit.trim().equals("2")) {
                                flag2 = false;
                                gender2 = false;
                            } else {
                                System.out.println("Enter Again");
                                flag2 = true;
                            }
                        } while (flag2);
                        employee.setGender(gender2);
                        employeeRepository.editEmployee(genderEdit, employee);
                        break;
                    case "5":
                        String editCitizenCode;
                        do {
                            System.out.println("Enter Edit EmployeeCitizenCode");
                            editCitizenCode = sc.nextLine();
                            if (!EmployeeValidate.checkEmployeeCitizenCode(editCitizenCode)) {
                                System.out.println("Type CitizenCode: (9-12) character Number");
                            }
                        } while (!EmployeeValidate.checkEmployeeCitizenCode(editCitizenCode));
                        employee.setEmployeeCitizenCode(editCitizenCode);
                        employeeRepository.editEmployee(editCitizenCode, employee);
                        break;
                    case "6":
                        String editPhone;
                        do {
                            System.out.println("Enter Edit EmployeePhone");
                            editPhone = sc.nextLine();
                            if (!EmployeeValidate.checkEmployeePhone(editPhone)) {
                                System.out.println("Type Phone: 84-0xxxxxxxxx");
                            }
                        } while (!EmployeeValidate.checkEmployeePhone(editPhone));
                        Long editPhone1 = Long.parseLong(editPhone);
                        employee.setPhone(editPhone1);
                        employeeRepository.editEmployee(editPhone, employee);
                        break;
                    case "7":
                        String editEmail;
                        do {
                            System.out.println("Enter Edit Email");
                            editEmail = sc.nextLine();
                            if (!EmployeeValidate.checkEmployeeMail(editEmail)) {
                                System.out.println("Type Email : abc@abc.com");
                            }
                        } while (!EmployeeValidate.checkEmployeeMail(editEmail));
                        employee.setEmail(editEmail);
                        employeeRepository.editEmployee(editEmail, employee);
                        break;
                    case "8":
                        String editLevel = "";
                        boolean flagLv = true;
                        do {
                            System.out.println("Edit Employee Level\n" +
                                    "1. Intermediate\n" +
                                    "2. College\n" +
                                    "3. University\n" +
                                    "4. After University\n");
                            String choiceEdit = sc.nextLine();
                            switch (choiceEdit) {
                                case "1":
                                    editLevel = "Intermediate";
                                    flagLv = false;
                                    break;
                                case "2":
                                    editLevel = "College";
                                    flagLv = false;
                                    break;
                                case "3":
                                    editLevel = "University";
                                    flagLv = false;
                                    break;
                                case "4":
                                    editLevel = "After University";
                                    flagLv = false;
                                    break;
                                default:
                                    System.out.println("Enter Wrong, Try Again");
                                    flagLv = true;
                                    break;
                            }
                        } while (flagLv);
                        employee.setLevel(editLevel);
                        employeeRepository.editEmployee(editLevel, employee);
                        break;
                    case "9":
                        String editPosition = "";
                        boolean flagPs = true;
                        do {
                            System.out.println("Enter Edit Position\n" +
                                    "1.Reception\n" +
                                    "2.Waiter\n" +
                                    "3.Specialist\n" +
                                    "4.Supervisor\n" +
                                    "5.Manager\n" +
                                    "6.Director\n");
                            String choicePosition = sc.nextLine();
                            switch (choicePosition) {
                                case "1":
                                    editPosition = "Reception";
                                    flagPs = false;
                                    break;
                                case "2":
                                    editPosition = "Waiter";
                                    flagPs = false;
                                    break;
                                case "3":
                                    editPosition = "Specialist";
                                    flagPs = false;
                                    break;
                                case "4":
                                    editPosition = "Supervisor";
                                    flagPs = false;
                                    break;
                                case "5":
                                    editPosition = "Manager";
                                    flagPs = false;
                                    break;
                                case "6":
                                    editPosition = "Director";
                                    flagPs = false;
                                    break;
                                default:
                                    System.out.println("Enter Wrong");
                                    flagPs = true;
                                    break;
                            }

                        } while (flagPs);
                        employee.setPosition(editPosition);
                        employeeRepository.editEmployee(editPosition, employee);
                        break;
                    case "10":
                        double editSalary;
                        do {
                            System.out.println("Enter Edit Salary");
                            editSalary = Double.parseDouble(sc.nextLine());
                            if (editSalary <= 0) {
                                System.out.println("Salary > 0");
                            }
                        } while (editSalary <= 0);
                        employee.setSalary(editSalary);
                        employeeRepository.editEmployee(String.valueOf(editSalary),employee);
                        break;
                    case "11":
                        flag = false;
                    default:
                        System.out.println("Enter Choice Again");
                        break;
                }
            } while (flag);
        } else {
            System.out.println("ID not Found");
        }
    }
}
