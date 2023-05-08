package case_study.ultils;

import case_study.model.person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadEmployeeFile {
    public static void writeEmployeeListToFile(List<Employee> employeeList, String path){
        File file =new File(path);
        try{
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Employee e: employeeList) {
                bw.write(e.getInfoEmployeeToCsv());
                bw.newLine();
            }
            bw.flush();
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Employee> readEmployeeListFromFile(String path){
        File file = new File(path);
        List<Employee> employeeList = new ArrayList<>();
        try{
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            while ((line = br.readLine())!=null && !line.equals("")){
                String [] employeeArr = line.split(",");
                //String name, String birthDay, boolean gender, int cardID, int phone, String email, String level,
                //String position, double salary
                Employee employee = new Employee(employeeArr[0],employeeArr[1],Boolean.getBoolean(employeeArr[2]),employeeArr[3],Long.parseLong(employeeArr[4]),employeeArr[5],
                        employeeArr[6],employeeArr[7],Double.parseDouble(employeeArr[8]),employeeArr[9]);
                employeeList.add(employee);

            }
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return employeeList;
    }
}
