package ss16_text_file.exersice.read_write_again;

import ss16_text_file.exersice.copy_file_text.ReaderFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderClass {
    public static void main(String[] args) {
        List<NguyenVietCao> listHung = new ArrayList<>();
        listHung = readNguyenVietCao("C:\\Code_Gym\\Module2\\src\\ss16_text_file\\exersice\\read_write_again" +
                "\\source_file_nguyen_viet_cao.txt");
        for (NguyenVietCao cao : listHung) {
            System.out.println(cao);
        }
        writeNguyenVietCao("C:\\Code_Gym\\Module2\\src\\ss16_text_file\\exersice\\read_write_again\\" +
                "target_file.txt", listHung);
    }

    public static List<NguyenVietCao> readNguyenVietCao(String pathSourceCao) {
        List<NguyenVietCao> listRead = new ArrayList<>();
        File file = new File(pathSourceCao);
        FileReader fileReader;
        BufferedReader bufferedReader;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String str = null;
            String[] array;
            NguyenVietCao nguyenVietCao;
            while ((str = bufferedReader.readLine()) != null) {
                array = str.split(",");
                nguyenVietCao = new NguyenVietCao(array[0], Double.parseDouble(array[1]), Double.parseDouble(array[2]),
                        Integer.parseInt(array[3]), array[4]);
                listRead.add(nguyenVietCao);
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

    public static void writeNguyenVietCao(String pathTargetNguyenVietCao, List<NguyenVietCao> listNguyenVietCao) {
        try {
            FileWriter fileWriter = new FileWriter(pathTargetNguyenVietCao, true);
            for (NguyenVietCao cao : listNguyenVietCao) {
                fileWriter.write(cao.getInformationToCsv());
                fileWriter.write("\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
