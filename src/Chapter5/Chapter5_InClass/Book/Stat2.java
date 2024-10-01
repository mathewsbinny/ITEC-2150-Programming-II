package WithData;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Stat2 {
    public static void main(String[] args) throws IOException {

        List<Double> numbers = readFile("Book.csv");
        double sum = sum(numbers);
        double lw = lowestNumber(numbers);
        double hw = highestNumber(numbers);
        double av = sum / numbers.size();

        String result = "Sum: " + sum +'\n' + "The lowest number: " + lw+ "\n" +
                "The highest number: " + hw + "\n" + "The average: " + av;

        writeFile("Result.txt",result);

        display(result);

    }

    public static List<Double> readFile(String filename) throws IOException {
        List<Double> numbers = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filename))){
            String line ;
            while( (line = br.readLine()) != null){
                for(String x: line.split("\\s+")){
                    if(!x.trim().isEmpty()){
                        numbers.add(Double.parseDouble(x.trim()));
                    }
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
        return sum;//String.format("%.2f",sum)
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

    public static String average (List<Double> numbers){
        double sum = 0.0;
        for(Double x: numbers){
            sum += x;
        }
        return String.format("%.2f", sum /numbers.size());
    }

    public static void display(String content){
        System.out.println(content);
    }
}
