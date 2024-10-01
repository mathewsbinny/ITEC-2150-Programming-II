package AccessFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFile2 {
    public static void main(String[] args) {

        try {
            List<String> lines = Files.readAllLines(Paths.get("Hamlet.txt"));

            //Collections.reverse(lines);


         //   System.out.println(lines);
            //(1)
//            for(String line   : lines  ){
//                System.out.println(line);
//            }

            //(2)
            //lines.forEach(line -> System.out.println(line));

            lines.forEach(System.out::println);

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
