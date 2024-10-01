package Weather;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Weather2 {

    //create a method for retrieving the file
    public static double[][][] readFile(String filename) throws IOException{

        final int NUMBER_OF_DAYS = 10;
        final int NUMBER_OF_HOURS = 24;

        double[][][] wData = new double[NUMBER_OF_DAYS][NUMBER_OF_HOURS][2];

        File file = new File(filename);
        Scanner input = new Scanner(file);

            while (input.hasNext()) {
                int day = input.nextInt();// 1 through 10
                int hour = input.nextInt(); //1 through 24
                double temp = input.nextDouble();
                double hum = input.nextDouble();

                wData[day - 1][hour - 1][0] = temp;
                wData[day - 1][hour - 1][1] = hum;
            }

        return wData;

    }


    public static void computeAverage(double[][][] data){

        final int NUMBER_OF_DAYS = 10;
        final int NUMBER_OF_HOURS = 24;
        for(int i = 0; i < NUMBER_OF_DAYS; i++){
            double sumTem = 0, sumHum = 0;

            for(int j = 0; j < NUMBER_OF_HOURS; j++){

                sumTem += data[i][j][0] ;
                sumHum += data[i][j][1] ;
            }

            System.out.printf("Day%2d's average temperature is %.2f\n", i +1, sumTem/NUMBER_OF_HOURS);
            System.out.printf("Day%2d's average humidity is %.2f\n\n", i + 1, sumHum/NUMBER_OF_HOURS);

        }

    }

    public static void main(String[] args) throws IOException{
       double[][][] x =  readFile("src/Weather/weather.txt");
       computeAverage(x);
    }
}