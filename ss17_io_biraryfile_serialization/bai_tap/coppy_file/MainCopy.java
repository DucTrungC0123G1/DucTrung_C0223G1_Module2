package ss17_io_biraryfile_serialization.bai_tap.coppy_file;

import static ss17_io_biraryfile_serialization.bai_tap.coppy_file.WriteReadCopy.copyReadFile;

public class MainCopy {
    public static void main(String[] args) {
        String sourceFile ="ss17_io_biraryfile_serialization/bai_tap/coppy_file/Source_file.txt";
        String targetFile ="ss17_io_biraryfile_serialization/bai_tap/coppy_file/Target_file.txt";
        String str = copyReadFile(targetFile);
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        WriteReadCopy.copyWriteFile(sourceFile,str);
    }


}
