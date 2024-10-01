package AccessFile;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileScanner {
    public static void main(String[] args) {
       try {
           File file = new File("src/AccessFile/hamlet.txt");

           Scanner scanner = new Scanner(file);
           while (scanner.hasNextLine()) {
               String line = scanner.nextLine();
               System.out.println(line);
           }

           scanner.close();
       }catch(IOException e){

       }
    }
}
