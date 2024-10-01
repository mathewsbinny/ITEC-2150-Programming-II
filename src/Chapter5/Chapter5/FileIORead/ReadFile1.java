import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile1 {
    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("src/AccessFile/hamlet.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();

//        }catch(FileNotFoundException e){
//

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
