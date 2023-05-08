package case_study.repository;

import case_study.model.person.Customer;
import case_study.ultils.WriteAndReadCustomerFile;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static List<Customer> customerList = new ArrayList<>();
    public static final String CUSTOMER_FILE_PATH = "D:\\CodeGym\\C0223G1_NguyenDucTrung\\Module2\\src\\case_study\\data\\customer.csv";


    @Override
    public List<Customer> getCustomerList() {
        customerList = WriteAndReadCustomerFile.readCustomerListFromFile(CUSTOMER_FILE_PATH);
        return customerList;
    }

    @Override
    public void addNewCustomer(Customer customer) {
        customerList.add(customer);
        WriteAndReadCustomerFile.writeCustomerListToFile(customerList,CUSTOMER_FILE_PATH);
    }

    @Override

    public Customer findIDCustomer(String idCustomer) {
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getCustomerID().equals(idCustomer)){
             return customerList.get(i);
            }
        }return null;
    }

    @Override
    public void editCustomer(String id, Customer customer) {
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).equals(customer)){
                customerList.set(i,customer);
                WriteAndReadCustomerFile.writeCustomerListToFile(customerList,CUSTOMER_FILE_PATH);
            }
        }

    }



}
