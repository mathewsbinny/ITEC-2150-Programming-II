import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile1LinebyLine {
    public static void main(String[] args) {

        try {
            FileReader file = new FileReader("src/AccessFile/HamletShort.txt");

            BufferedReader bufferedReader = new BufferedReader(file);

            String line1 = bufferedReader.readLine();
            String line2 = bufferedReader.readLine();
            String line3 = bufferedReader.readLine();
        }catch(IOException e){

        }
    }
}
