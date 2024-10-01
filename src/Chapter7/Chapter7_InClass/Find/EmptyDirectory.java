
package Recursion;
/**
 * This program finds empty directories.
 * recursion
 *
 */

import java.io.File;
import java.util.Scanner;

public class EmptyDirectory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the starting directory path (e.g., C:\\Users\\hpark\\Documents):");
        String startingDirectoryPath = scanner.nextLine();
        scanner.close();

        File startingDir = new File(startingDirectoryPath);
        findEmptyDirectory(startingDir); //recursion
    }

    /**
     * findEmptyDirectory
     * @param file
     */
    public static void findEmptyDirectory(File file){
        if(file.isDirectory()){
            File[] files = file.listFiles();
            if(files != null){ //if the directory is not null or empty
                if(files.length == 0 ){ //base case
                    System.out.println("This is an empty directory. " + file.getAbsolutePath());
                }
                else{
                    for(File x: files){
                        findEmptyDirectory(x); //recursive call
                    }
                }
            }
        }
    }
}
