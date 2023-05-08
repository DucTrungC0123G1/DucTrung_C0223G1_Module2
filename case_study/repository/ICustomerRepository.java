package case_study.repository;

import case_study.model.person.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> getCustomerList();
    void addNewCustomer(Customer customer);
    Customer findIDCustomer(String idCustomer);
    void editCustomer(String id, Customer customer);
}
