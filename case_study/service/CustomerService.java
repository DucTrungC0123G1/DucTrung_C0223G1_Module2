package case_study.service;

import case_study.model.person.Customer;
import case_study.repository.CustomerRepository;
import case_study.ultils.CustomerValidate;

import javax.sound.midi.Soundbank;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private CustomerRepository customerRepository = new CustomerRepository();
    Scanner sc = new Scanner(System.in);

    @Override
    public void displayCustomer() {
        List<Customer> customerList = customerRepository.getCustomerList();
        for (Customer c : customerList) {
            System.out.println(c);
        }
    }

    @Override
    public void addNewCustomer() {
        //(String name, String birthDay, boolean gender, String cardID, long phone, String email, String typeCustomer,
        //                    String address, String customerID)
        String nameCustomer;
        do {
            System.out.print("Enter Name Customer :");
            nameCustomer = sc.nextLine();
        } while (!CustomerValidate.checkCustomerName(nameCustomer));
        System.out.print("Enter Birthday Customer: ");
        String birthDayCustomer = sc.nextLine();

        String choiceGender;
        boolean flag = true;
        boolean gender = false;
        do {
            System.out.print("Enter Gender Customer: \n" +
                    "1. Male\n" +
                    "2. Female\n");
            choiceGender = sc.nextLine();
            if (choiceGender.trim().equals("1")) {
                flag = false;
                gender = true;

            } else if (choiceGender.trim().equals("2")) {
                flag = false;
                gender = false;
            } else {
                System.out.println("Chose Again");
                flag = true;
            }
        } while (flag);
        String cardIdCustomer;
        do {
            System.out.print("Enter Card ID Customer: ");
            cardIdCustomer = sc.nextLine();
        } while (!CustomerValidate.checkCustomerCardID(cardIdCustomer));

        String phoneCustomer;
        do {
            System.out.print("Enter Phone Customer: ");
            phoneCustomer = sc.nextLine();

        } while (!CustomerValidate.checkCustomerPhone(phoneCustomer));
        Long phoneCustomer1 = Long.parseLong(phoneCustomer);

        String emailCustomer;
        do {
            System.out.print("Enter Email Customer: ");
            emailCustomer = sc.nextLine();
        } while (!CustomerValidate.checkCustomerEmail(emailCustomer));

        String typeCustomer = "";
        boolean flagType = true;
        do {
            System.out.print("Enter Type Customer: \n" +
                    "1.Diamond\n" +
                    "2.Platinum\n" +
                    "3.Gold\n" +
                    "4.Silver\n" +
                    "5.Member\n");
            String choiceType = sc.nextLine();
            switch (choiceType) {
                case "1":
                    typeCustomer = "Diamond";
                    flagType = false;
                    break;
                case "2":
                    typeCustomer = "Platinum";
                    flagType = false;
                    break;
                case "3":
                    typeCustomer = "Gold";
                    flagType = false;
                    break;
                case "4":
                    typeCustomer = "Silver";
                    flagType = false;
                    break;
                case "5":
                    typeCustomer = "Member";
                    flagType = false;
                    break;
                default:
                    System.out.println("Enter Wrong, Try Again");
                    flagType = true;
                    break;
            }
        } while (flagType);

        String addressCustomer;
        System.out.print("Enter Address Customer: ");
        addressCustomer = sc.nextLine();

        String idCustomer;
        do {
            System.out.print("Enter ID Customer: ");
            idCustomer = sc.nextLine();
        } while (!CustomerValidate.checkCustomerID(idCustomer));
        Customer newCustomer = new Customer(nameCustomer, birthDayCustomer, gender, cardIdCustomer, phoneCustomer1, emailCustomer,
                typeCustomer, addressCustomer, idCustomer);
        customerRepository.addNewCustomer(newCustomer);
        System.out.println("Add Customer Success");

    }

    @Override
    public void editCustomer() {
        String idCustomer;
        displayCustomer();
        System.out.println("Enter ID To Edit Customer");
        idCustomer = sc.nextLine();
        Customer customer = customerRepository.findIDCustomer(idCustomer);
        //(String name, String birthDay, boolean gender, String cardID, long phone, String email, String typeCustomer,
        //                    String address, String customerID)
        if (customer != null) {
            boolean flag = true;
            do {
                System.out.print("Choice Information Customer \n" +
                        "1.Edit Name\n" +
                        "2.Edit Birthday\n" +
                        "3.Edit Gender\n" +
                        "4.Edit CardID\n" +
                        "5.Edit Phone\n" +
                        "6.Edit Email\n" +
                        "7.Edit TypeCustomer\n" +
                        "8.Edit Address\n" +
                        "9.Edit CustomerID\n" +
                        "10.Return Menu\n");
                String choiceEdit = sc.nextLine();
                switch (choiceEdit) {
                    case "1":
                        String editName;
                        do {
                            System.out.print("Enter Name Customer: ");
                            editName = sc.nextLine();
                            if (!CustomerValidate.checkCustomerName(editName)) {
                                System.out.println("Enter Again");
                            }
                        } while (!CustomerValidate.checkCustomerName(editName));
                        customer.setName(editName);
                        break;
                    case "2":
                        String editBirthday;
                        do {
                            System.out.println("Enter Birthday Customer: ");
                            editBirthday = sc.nextLine();
                            if (!CustomerValidate.checkCustomerBirthday(editBirthday)) {
                                System.out.println("Enter Again");
                            }
                        } while (!CustomerValidate.checkCustomerBirthday(editBirthday));
                        customer.setBirthDay(editBirthday);
                        break;
                    case "3":
                        boolean flagGender = true;
                        boolean editGender = false;
                        do {
                            System.out.print("Edit Gender Customer\n" +
                                    "1.Male\n" +
                                    "2.Female\n");
                            String choiceEditGender = sc.nextLine();
                            if (choiceEditGender.trim().equals("1")) {
                                editGender = true;
                                flagGender = false;

                            } else if (choiceEditGender.trim().equals("2")) {
                                editGender = false;
                                flagGender = false;
                            } else {
                                System.out.println("Enter Again");
                                flagGender = true;
                            }

                        } while (flagGender);
                        customer.setGender(editGender);
                        break;
                    case "4":
                        String editCardID;
                        do {
                            System.out.print("Enter Edit CardID: ");
                            editCardID = sc.nextLine();
                            if (!CustomerValidate.checkCustomerCardID(editCardID)){
                                System.out.println("Enter Again");
                            }
                        }while (!CustomerValidate.checkCustomerCardID(editCardID));
                        customer.setCardID(editCardID);
                        customerRepository.editCustomer(editCardID,customer);
                        break;
                    case "5":
                        String editPhone;
                        do {
                            System.out.print("Enter Edit Phone: ");
                            editPhone = sc.nextLine();
                            if (!CustomerValidate.checkCustomerPhone(editPhone)){
                                System.out.println("Enter Again");
                            }

                        }while (!CustomerValidate.checkCustomerPhone(editPhone));
                        Long editPhone1 = Long.parseLong(editPhone);
                        customer.setPhone(editPhone1);
                        customerRepository.editCustomer(editPhone,customer);
                        break;
                    case "6":
                        String editEmail;
                        do {
                            System.out.print("Enter Edit Email");
                            editEmail = sc.nextLine();
                            if (!CustomerValidate.checkCustomerEmail(editEmail)){
                                System.out.println("Enter Email Again");
                            }
                        }while (!CustomerValidate.checkCustomerEmail(editEmail));
                        customer.setEmail(editEmail);
                        customerRepository.editCustomer(editEmail,customer);
                        break;
                    case "7":
                        String editTypeCustomer="";
                    case "10":
                        flag = false;
                        break;
                    default:
                        System.out.println("Choice Menu Edit Again");
                        flag = true;
                }

            } while (flag);
        } else {
            System.out.println("ID not Found");
        }
    }
}
