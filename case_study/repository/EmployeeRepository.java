package case_study.repository;

import case_study.model.person.Employee;
import case_study.ultils.WriteAndReadEmployeeFile;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository{
    private static List<Employee> employeeList = new ArrayList<>();
    private static final String EMPLOYEE_FILE_PATH= "D:\\CodeGym\\C0223G1_NguyenDucTrung\\Module2\\src\\case_study\\data\\employee.csv";

    @Override
    public List<Employee> getEmployeeList() {
        employeeList = WriteAndReadEmployeeFile.readEmployeeListFromFile(EMPLOYEE_FILE_PATH);
        return employeeList;
    }

    @Override
    public void addNewEmployee(Employee employee) {
    employeeList.add(employee);
        WriteAndReadEmployeeFile.writeEmployeeListToFile(employeeList,EMPLOYEE_FILE_PATH);
    }

    @Override
    public Employee findIDEmployee(String idEmployee) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getCardID().equals(idEmployee)){
            }return employeeList.get(i);
        }return null;
    }

    @Override
    public void editEmployee(String id, Employee employee) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).equals(employee)){
                employeeList.set(i,employee);
                WriteAndReadEmployeeFile.writeEmployeeListToFile(employeeList,EMPLOYEE_FILE_PATH);
            }
        }

    }




}
