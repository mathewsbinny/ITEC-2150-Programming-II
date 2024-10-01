package Practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileRecursiveDuplicator {

    public static void main(String[] args) {

        String filePath = "example.txt";

        try {
            List<String> fileContents = readFile(filePath);
            for (String line : fileContents) {
                System.out.println(duplicateLine(line, 2));
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static List<String> readFile(String filePath) throws IOException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }
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
