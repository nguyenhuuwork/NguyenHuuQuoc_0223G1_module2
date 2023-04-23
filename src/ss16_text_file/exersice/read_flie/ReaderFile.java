package ss16_text_file.exersice.read_flie;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderFile {
    public static void main(String[] args) {
        List<National> listHung = new ArrayList<>();
        listHung = ReaderFile.list("C:\\Code_Gym\\Module2\\src\\ss16_text_file\\exersice\\copy_file_text\\national_reader.txt");
        for (National a : listHung) {
            System.out.println(a);
        }
    }

    public static List<National> list(String listway) {
        List<National> listRead = new ArrayList<>();
        File file = new File(listway);
        FileReader fileReader ;
        BufferedReader bufferedReader ;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String str = null;
            String[] array;
            National national;
            while ((str = bufferedReader.readLine()) != null) {
                array = str.split(",");
                national = new National(Integer.parseInt(array[0]), array[1], array[2]);
                listRead.add(national);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listRead;
    }
}
