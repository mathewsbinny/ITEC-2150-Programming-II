package AccessFile.Writing.withResource;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

public class TryWithResource1 {

    public static void main(String[] args) {
        try
                (
                        BufferedWriter bw = new BufferedWriter(new FileWriter("newText.txt"));
                )

        {bw.write("This is how to use try-with-resource. you do not call pw.close()");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}