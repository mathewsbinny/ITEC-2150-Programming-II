package WithData;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Stat4 {

    public static void main(String[] args) {
        Stats stats = computeStats("Book3.txt");

        String result = "The sum of the numbers is: " + stats.sum + "\n" +
                "The lowest number is: " + stats.lowest + "\n" +
                "The highest number is: " + stats.highest + "\n" +
                "The average of the numbers is: " + stats.average;

        writeFile("stats.txt", result);
        display(result);
    }

    public static Stats computeStats(String filename) {
        double sum = 0;
        double lowest = Double.MAX_VALUE;
        double highest = Double.MIN_VALUE;
        int count = 0;
        List<Double> numbers = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\s+");
                for (String part : parts) {
                    try {
                        double num = Double.parseDouble(part.trim());
                        numbers.add(num);
                        sum += num;
                        count++;
                        if (num < lowest) {
                            lowest = num;
                        }
                        if (num > highest) {
                            highest = num;
                        }
                    } catch (NumberFormatException e) {
                        // Ignore non-numeric values
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        double average = sum / count;
        return new Stats(sum, lowest, highest, average, numbers);
    }

    public static void writeFile(String filename, String content) {
        try (FileWriter writer = new FileWriter(filename);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            bufferedWriter.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * inner class
     */
    static class Stats {
        double sum;
        double lowest;
        double highest;
        double average;
        List<Double> numbers;

        Stats(double sum, double lowest, double highest, double average, List<Double> numbers) {
            this.sum = sum;
            this.lowest = lowest;
            this.highest = highest;
            this.average = average;
            this.numbers = numbers;
        }
    }

    public static void display(String content) {
        System.out.println(content);
    }
}
