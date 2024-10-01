package Practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileRecursiveDuplicator2 {

    public static void main(String[] args) {

        String filePath = "example.txt";

        try {
            List<String> fileContents = readFile(filePath);
            for (String line : fileContents) {
                System.out.println(duplicateLine(line, 2));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    public static List<String> readFile(String filePath) throws FileNotFoundException {
        List<String> lines = new ArrayList<>();
        Scanner scanner = new Scanner(new File(filePath));

        while (scanner.hasNextLine()) {
            lines.add(scanner.nextLine());
        }

        scanner.close();
        return lines;
    }

    public static String duplicateLine(String line, int times) {
        if (times <= 0) {
            return "";
        } else if (times == 1) {
            return line;
        } else {
            return line + " " + duplicateLine(line, times - 1);
        }
    }
}
