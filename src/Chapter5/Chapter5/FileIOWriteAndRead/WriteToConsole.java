package AccessFile.Writing;

import java.io.PrintWriter;

public class WriteToConsole {
    public static void main(String[] args) {
       //Part I
        //(1) step one to prepare for printing data
        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Printer writer demo");
        pw.println("This is the way how to print data in the console");

        //(2) flush. this is the way how to store or lock the data you want to print out. Without calling flush()
        //you cannot store or the generate the output to the console.
        pw.flush();

        //Part II
        System.out.println("Printer writer demo by using println.. PrintStream. ");




    }
}
