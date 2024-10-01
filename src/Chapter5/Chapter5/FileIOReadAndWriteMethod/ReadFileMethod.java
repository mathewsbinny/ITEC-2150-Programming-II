package methodPackage.readingFile;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileMethod {
    public static void main(String[] args) {

        String pathfile = "src/methodPackage/readingFile/Hamlet.txt";// src/methodPackage/readingFile/Hamlet.txt
        try {
            String result = readFile(pathfile);
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String readFile(String filepath) throws IOException {
        StringBuilder sb = new StringBuilder();

        //try-with-resource
        try (FileReader fr = new FileReader(filepath);
             BufferedReader br = new BufferedReader(fr);
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append('\n');
            }

        }

        return sb.toString();
    }
}
