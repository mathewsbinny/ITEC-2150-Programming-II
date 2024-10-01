package Doctors;
/**
 * class: DoctorSchedule
 * description: This program will ask a user to enter the doctor's name and specialization
 * Then this program will provide information about the doctor's name and schedule
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DoctorSchedule {

    private static List<Doctor> dl = new ArrayList<Doctor>(); // doctor's list List
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueRunning = true;

        while(continueRunning) {
            System.out.println("Choose an option");
            System.out.println("1: Add doctor");
            System.out.println("2: View schedule");
            System.out.println("3: Exit");

            int option = scanner.nextInt();

            scanner.nextLine(); //this is to consume a new line

            switch(option) {
                case 1:
                    addDoctor(scanner);
                    break;
                case 2:
                    viewSchedule();
                    break;
                case 3:
                    continueRunning = false;
                default:
                    System.out.println("Invalid input");
            }
            scanner.close();
    }

    /**
     * method: addDoctor
     * @param input
     */
    public static void addDoctor(Scanner input) {
        System.out.println("Enter doctor's name: ");
        String name = input.nextLine();

        System.out.println("Choose doctor's specialization: ");
        System.out.println("1: Surgeon");
        System.out.println("2: Family Medicine");

        int specialization = input.nextInt();

        switch(specialization) {
            case 1:
                dl.add(new Surgeon(name));
                break;
            case 2:
                dl.add(new FamilyMedicine(name));
                break;
            default:
                System.out.println("invalid");
        }
    }

    /**
     * method:viewSchedule
     */
    public static void viewSchedule() {
        if(dl.isEmpty()) {
            System.out.println("No doctor added yet");
            return;
        }

        for(Doctor doctor: dl) {
            System.out.println(doctor.getName() + ": " + doctor.getSchedule());
        }
    }
}
