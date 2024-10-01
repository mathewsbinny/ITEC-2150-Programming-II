package MethodCreating;

import java.io.*;
import java.util.Scanner;

public class FileReadWrite2 {
    public static void main(String[] args) throws IOException{

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the path of the file you want to read. ");
        String readFilePath = input.nextLine();

        System.out.println("Please tner the path you want to write as a new file name.");
        String writeFilePath = input.nextLine();


//        String filePath = "hamlet.txt"; //we will use this file as source file to retrieve or read.
//        String newFilePath = "newFile.txt";


        String lines =  readFile(readFilePath);
        System.out.println("This lines from teh readFile Method");
        System.out.println(lines);//write contents to the console

        writeFile(writeFilePath,lines); //write to the new file you created when you call writeFile method.

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

    public static void writeFileReverse(String filePath, String contents) throws IOException{
        StringBuilder reverseOrder = new StringBuilder(contents).reverse();

        try(FileWriter fw = new FileWriter(filePath)){
            fw.write(String.valueOf(reverseOrder));
        }
    }
}
