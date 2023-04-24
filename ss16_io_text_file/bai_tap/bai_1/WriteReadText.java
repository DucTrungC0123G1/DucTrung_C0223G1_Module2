package ss16_io_text_file.bai_tap.bai_1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteReadText {
    public static void writedFile(String pathFile, List<String> text, Boolean append) {
        File file = new File(pathFile);
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(file, append);
            bw = new BufferedWriter(fw);
            for (int i = 0; i < text.size(); i++) {
                bw.write(text.get(i));
                bw.newLine();
            }
            bw.close();
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public static List<String> readFile(String pathFile) {
        List<String> list = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fr = null;
        String line = null;
        try {
            fr = new FileReader(file);
            BufferedReader bw = new BufferedReader(fr);
            while ((line = bw.readLine()) != null) {
                list.add(line);
            }
            bw.close();
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
