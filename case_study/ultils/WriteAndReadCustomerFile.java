package case_study.ultils;

import case_study.model.person.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadCustomerFile {
    public static void writeCustomerListToFile(List<Customer> customerList, String path){
        File file = new File(path);
        try{
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Customer c: customerList) {
                bw.write(c.getInfoCustomerToCsv());
                bw.newLine();

            }
            bw.flush();
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Customer> readCustomerListFromFile(String path){
        File file = new File(path);
        List<Customer> customerList = new ArrayList<>();
        try{
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            while ((line = br.readLine())!=null&&!line.equals("")){
                String [] customerArr = line.split(",");
                //String name, String birthDay, boolean gender, String cardID, int phone, String email, String typeCustomer,
                //                    String address, String customerID
                Customer customer = new Customer(customerArr[0],customerArr[1],Boolean.getBoolean(customerArr[2]),customerArr[3],
                Long.parseLong(customerArr[4]),customerArr[5],customerArr[6],customerArr[7],customerArr[8]);
                customerList.add(customer);
            }
            br.close();
            fr.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return customerList;
    }
}
