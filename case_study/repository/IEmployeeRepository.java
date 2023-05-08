package case_study.repository;

import case_study.model.person.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> getEmployeeList();
    void addNewEmployee(Employee employee);
   Employee findIDEmployee(String idEmployee);
   void editEmployee(String id, Employee employee);



}
