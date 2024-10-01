package AccessFile.Writing.CSVPackage;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class CSVTester {
    public static void main(String[] args) throws IOException {
        List<Student> list = new ArrayList<Student>();

        list.add(new Student("90001","Eden", "et@gxx.exx"));
        list.add(new Student("90002", "Elizabeth", "ed@gxx.edu"));
        list.add(new Student("90003","Jah","jm@gxx.exx"));


        PrintWriter pw = new PrintWriter(new File("src/AccessFile/Writing/CSVPackage/studentList.csv"));
        pw.println("Student ID, Name, Email");

//        for(Student student: list){
//            pw.println(student.toString());
//        }

        list.forEach(student -> pw.println(student.toString()));

        pw.close();
    }
}
