package MethodCreating;

import java.io.*;

public class FileReadWrite1 {
    public static void main(String[] args) throws IOException{

        String filePath = "hamlet.txt"; //we will use this file as source file to retrieve or read.
        String newFilePath = "newFile.txt";


       String lines =  readFile(filePath);
        System.out.println("This lines from teh readFile Method");
        System.out.println(lines);//write contents to the console

        writeFile(newFilePath,lines); //write to the new file you created when you call writeFile method.

    }

    /**
     * this method will read contents from a file passed as a parameter
     * @param filePath
     * @return
     */
    public static String readFile(String filePath) throws IOException {

        StringBuilder sb = new StringBuilder();
        //use try-with-resource
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            while( (line = br.readLine() )!= null){
                sb.append(line).append('\n');
            }
        }
        return sb.toString();
    }

    public static void writeFile(String filePath, String contents) throws IOException{
        try(FileWriter fw = new FileWriter(filePath)){
            fw.write(contents);
        }
    }
}
