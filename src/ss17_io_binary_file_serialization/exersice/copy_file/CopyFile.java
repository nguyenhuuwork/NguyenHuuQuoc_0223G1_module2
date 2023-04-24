package ss17_io_binary_file_serialization.exersice.copy_file;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(new File("C:\\Code_Gym\\Module2\\src\\ss17_io_binary_" +
                    "file_serialization\\exersice\\copy_file\\source_write_file.txt"));
            outputStream = new FileOutputStream(new File("C:\\Code_Gym\\Module2\\src\\ss17_io_binary_file_" +
                    "serialization\\exersice\\copy_file\\source_reader_file.txt"));
            int length;
            byte[] buffer = new byte[1024];
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
            System.out.println("File is not copied successfull");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            inputStream.close();
            outputStream.close();
        }
    }
}
