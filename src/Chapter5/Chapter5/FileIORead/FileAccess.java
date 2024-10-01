import java.io.File;
import java.util.Date;

public class FileAccess {
    public static void main(String[] args) {
        File file = new File("src/AccessFile/hamlet.txt");
        System.out.println("Does hamlet.txt exist? " + file.exists());
        System.out.println("Number of characters in hamlet.txt: " + file.length());
        System.out.println("Is this file readable? " + file.canRead());
        System.out.println("Is this file writable? " + file.canWrite());
        System.out.println("Is this file a directory? " + file.isFile());
        System.out.println("Is this path an absolute path? " + file.getPath());

        System.out.println(file.lastModified());
        long lm = file.lastModified();
        Date date = new Date(lm);
        System.out.println("Last modified on " + date);




    }
}
