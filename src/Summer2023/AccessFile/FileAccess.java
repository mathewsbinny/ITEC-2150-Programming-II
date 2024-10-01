package AccessFile;
import java.io.File;

public class FileAccess {
    public static void main(String[] args) {
        File file = new File("src/AccessFile/hamlet.txt");
        System.out.println("Does hamlet.txt exist?" + file.exists());
    }
}
