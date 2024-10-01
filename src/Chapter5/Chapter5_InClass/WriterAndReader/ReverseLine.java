package AccessFile.Reading.reverseOrder;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReverseLine {
    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("Hamlet.txt");
            BufferedReader br = new BufferedReader(fr);

            ReverseLine rl = new ReverseLine();
            rl.reversePrint(br);
            br.close();

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public void reversePrint(BufferedReader br) throws IOException {

        String line = br.readLine();
        //base to stop the recursion (1)
        if(   line    == null) return ; // end of the file
        //recursive call (2)
        reversePrint(br);
        System.out.println(line);
    }
}
