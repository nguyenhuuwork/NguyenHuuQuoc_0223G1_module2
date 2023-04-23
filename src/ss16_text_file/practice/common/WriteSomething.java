package ss16_text_file.practice.common;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteSomething {
//    public void writeFile(String pathFile, String line) {
//        String PATH = "ss16_text_file/practice/common/data.csv";
//        File file = new File(PATH);
//        try {
//            FileWriter fileWriter = new FileWriter(file, true);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            bufferedWriter.write(line);
//            bufferedWriter.newLine();
//            bufferedWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    WriteSomething writeSomething = new WriteSomething();

    public static void main(String[] args) {
        String str = "Nguyen Huu Quoc";
        try {
            FileWriter fileWriter = new FileWriter("src/ss16_text_file/practice/common/data.csv");
            fileWriter.write(str);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
