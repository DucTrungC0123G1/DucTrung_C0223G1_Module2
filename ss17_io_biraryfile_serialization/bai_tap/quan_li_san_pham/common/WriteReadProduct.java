package ss17_io_biraryfile_serialization.bai_tap.quan_li_san_pham.common;

import ss17_io_biraryfile_serialization.bai_tap.quan_li_san_pham.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteReadProduct {
    public static void writeProduct(String filePath, List<Product> productList, Boolean append) {
        File file = new File(filePath);
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            for (int i = 0; i < productList.size(); i++) {
                bw.write(productList.get(i).getInformationToCsv());
                bw.newLine();

            }
            bw.close();
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Product> readFile(String filePath) {
        ArrayList<Product> list = new ArrayList<>();
        File file = new File(filePath);
        FileReader fr = null;
        BufferedReader br = null;
        String line = null;
        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                String[] arrString = line.split(",");
                Product product = new Product(Integer.parseInt(arrString[0]), arrString[1], Double.parseDouble(arrString[2]),
                        arrString[3], arrString[4]);
                list.add(product);
            }
            fr.close();
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
