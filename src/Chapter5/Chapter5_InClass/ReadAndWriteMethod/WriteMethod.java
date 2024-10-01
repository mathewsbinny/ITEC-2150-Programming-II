package methodPackage.readingFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteMethod {

    public static void main(String[] args) throws IOException{

        String sourceFile = "src/methodPackage/readingFile/Hamlet.txt";
        String outputFile = "src/methodPackage/readingFile/output.txt";

        String sourceContents = readFile(sourceFile);
        writeFile(outputFile, sourceContents);

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

    public static void writeFile(String filepath, String contents){
        try(FileWriter fw = new FileWriter(filepath))
        {
            fw.write(contents);
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }

    public static void writeFileReverse(String filepath, String contents) throws IOException{
        StringBuilder sb = new StringBuilder(contents).reverse();

        try(  FileWriter fw = new FileWriter(filepath) ){
            fw.write(contents);
        }
    }

}
