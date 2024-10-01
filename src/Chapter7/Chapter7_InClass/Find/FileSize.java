package Recursion;
import java.io.File;
public class FileSize {
    public static void main(String[] args) {
        System.out.print("Enter a directory or a file: ");
        java.util.Scanner input = new java.util.Scanner(System.in);
        String directory = input.nextLine();

        //Display the size
        System.out.println(getSize(new java.io.File(directory)) + " bytes");
    }
    public static long getSize(File file){

        int total = 0;
        if(file.isDirectory()){
            File[] fileList = file.listFiles(); //this will return all list of files

            //you are going to iterate the array of files
            for(int i = 0; i < fileList.length && fileList != null; i++){
                total += getSize(fileList[i]);
            }
        }
        else{
                total += file.length(); //base case
        }
           return total;
    }
}
