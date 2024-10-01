package WithData;
/**
 * problem of this program does not retrieve the value from the second line.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Stat1 {
    public static void main(String[] args) throws IOException {
        List<Double> numbers = readFile("Book1.csv");
        double sum = sum(numbers);
        double lowest = lowestNumber(numbers);
        double highest = highestNumber(numbers);
        double average = sum / numbers.size();

        String result = "Sum: " + sum +'\n' + "The lowest number: " + lowest + "\n" +
                "The highest number: " + highest + "\n" + "The average: " + average;

        writeFile("Result.txt",result);

        display(result);

    }

    public static List<Double> readFile(String filename) throws IOException {

        List<Double> numbers = new ArrayList<Double>();
        try(BufferedReader br = new BufferedReader(new FileReader(filename))){
            String line;
            if( (line = br.readLine()) != null){
                String[] parts = line.split(",");
                for(String x: parts){
                    numbers.add(Double.parseDouble(x.trim()));
                }
            }
        }
        return numbers;
    }

    public static void writeFile(String name, String content) throws IOException{
        try(FileWriter fw = new FileWriter(name);
            BufferedWriter bw = new BufferedWriter(fw);
        ){
            bw.write(content);
        }
    }

    public static double sum(List<Double> list){
        double sum = 0;

        for(double num: list){
              sum += num;
        }

//        for(int i = 0; i < list.size(); i++){
//            sum += list.get(i);
//        }
        return sum;
    }

    public static double lowestNumber(List<Double> numbers){

        double lowest = Double.MAX_VALUE;
        for(double x: numbers){
            if(x < lowest){
                lowest = x;
            }
        }
        return lowest;
    }


    public static double highestNumber(List<Double> numbers){
        double highest = Double.MIN_VALUE;
        for(double x: numbers){
            if(x > highest){
                highest = x;
            }
        }
            return highest;
    }

    public static void display(String content){
        System.out.println(content);
    }
}
