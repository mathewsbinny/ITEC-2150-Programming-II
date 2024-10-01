package Stats;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StatTester {

    public static void main(String[] args) {

    }

    public static Stats computeStatistics(String filename) throws IOException {
        double sum = 0.0;
        double lowest = Double.MAX_VALUE;
        double highest = Double.MIN_VALUE;
        int i = 0;

        try(BufferedReader br = new BufferedReader(new FileReader(filename))){

            String line;

            if((line = br.readLine()) != null){
                    String[] parts = line.split(",");

                    for(String x: parts){
                        double number = Double.parseDouble(x.trim());
                        sum += number;
                        i++;
                        if(number < lowest){
                            lowest = number;
                        }

                        if(number > highest)
                        {
                            highest = number;
                        }
                    }
            }


        }
        double average = sum /i;

        return new Stats(sum, lowest, highest,average);
    }
}
