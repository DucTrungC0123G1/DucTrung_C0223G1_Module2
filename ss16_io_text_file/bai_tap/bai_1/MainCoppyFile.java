package ss16_io_text_file.bai_tap.bai_1;

import java.util.List;

public class MainCoppyFile {
    public static void main(String[] args) {
        String PATH_SOURCE_FILE = "ss16_io_text_file/bai_tap/bai_1/text.txt";
        String PATH_TARGET_FILE = "ss16_io_text_file/bai_tap/bai_1/textCoppy.txt";
        WriteReadText wr = new WriteReadText();
        List<String> stringList = wr.readFile(PATH_SOURCE_FILE);
        wr.writedFile(PATH_TARGET_FILE, stringList, true);

    }
}
