package AccessFile.Writing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {

    public static void main(String[] args) {

        File file = new File("text.txt");
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(file);
            pw.println("Writing over the file.//// ");
          //  pw.close();

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        finally{
            if(pw != null) {
                pw.close();
            }
        }
    }
}
