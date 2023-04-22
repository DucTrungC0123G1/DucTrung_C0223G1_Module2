package ss16_io_text_file.thuc_hanh.common;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class WriteReadFile {
    public static void main(String[] args) {
        String str = "Nguyen duc trung";
        String []arr= {"123","Nguyen","1993"};
        try {
            FileWriter fw = new FileWriter("data2.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(arr[0]+","+arr[1]+","+arr[2]);
            bw.close();
            fw.close();
        }catch (IOException e) {
            System.out.println("lỗi");;
        }
    }
}
