package AccessFile.Writing;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferedWriterDemo {

    public static void main(String[] args) {

        try {
            FileWriter fw = new FileWriter("src/AccessFile/Writing/Elizabeth.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            PrintWriter pw = new PrintWriter(bw);
            pw.println("This is another way to write data to a file. ");
            pw.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
