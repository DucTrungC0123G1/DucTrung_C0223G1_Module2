package ss16_io_text_file.bai_tap.bai_1;

import java.util.List;

public class MainCoppyFile {
    public static void main(String[] args) {
        String patch = "ss16_io_text_file/bai_tap/bai_1/text.txt";
        String pathFile = "ss16_io_text_file/bai_tap/bai_1/textCoppy.txt";
        WriteReadText wr = new WriteReadText();
        List<String> stringList = WriteReadText.readFile(patch);
        WriteReadText.writedFile(pathFile,stringList,true);

    }
}
