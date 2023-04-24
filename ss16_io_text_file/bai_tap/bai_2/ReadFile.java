package ss16_io_text_file.bai_tap.bai_2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static List<NationClass> readFiles(String path) {
        List<NationClass> nationClassList = new ArrayList<>();
        File file = new File(path);
        FileReader fr = null;
        BufferedReader br = null;
        String line = null;
        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                String[] str = line.split(",");
                nationClassList.add(new NationClass(Integer.parseInt(str[0]), str[1], str[2]));

            }
            fr.close();
            br.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return nationClassList;
    }

    public static void main(String[] args) {
        String path = "ss16_io_text_file/bai_tap/bai_2/Nation.csv";
        List<NationClass> list = readFiles(path);
        for (NationClass x : list) {
            System.out.println(x.getCsv());
        }
    }
}
