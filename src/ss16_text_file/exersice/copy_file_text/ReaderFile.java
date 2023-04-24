package ss16_text_file.exersice.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderFile {
    public static void main(String[] args) {
        List<Student> listHung = new ArrayList<>();
        listHung = ReaderFile.readFileStudent("C:\\Code_Gym\\Module2\\src\\ss16_text_file\\exersice\\copy" +
                "_file_text\\source_reader.csv");
        for (Student s : listHung) {
            System.out.println(s);
        }
        writeFileStudent("C:\\Code_Gym\\Module2\\src\\ss16_text_file\\exersice\\copy_file_text\\target_" +
                "file.txt", listHung);
    }

    public static List<Student> readFileStudent(String pathSourceStudent) {
        List<Student> listRead = new ArrayList<>();
        File file = new File(pathSourceStudent);
        FileReader fileReader;
        BufferedReader bufferedReader;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String str = null;
            String[] array;
            Student student;
            while ((str = bufferedReader.readLine()) != null) {
                array = str.split(",");
                student = new Student(Integer.parseInt(array[0]), array[1], Double.parseDouble(array[2]));
                listRead.add(student);
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

    public static void writeFileStudent(String pathTargetStudent, List<Student> studentList) {
        try {
            FileWriter fileWriter = new FileWriter(pathTargetStudent, true);

            for (Student s : studentList) {
                fileWriter.write(s.getInformationToCsv());
                fileWriter.write("\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
