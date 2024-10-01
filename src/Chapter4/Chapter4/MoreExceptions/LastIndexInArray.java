package Ch4Ex1.throwDemo;

import java.util.Scanner;

public class LastIndexInArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //create an array with four value
        int[] list = {1,2,3,4};
        int lastIndex = 0;

        System.out.println("Enter the last index number of this array. ");
        try {
            lastIndex = input.nextInt();

            if (lastIndex != list.length - 1) {
                throw new IllegalArgumentException("Incorrect index value");
            }
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            do{
                System.out.println("enter the last index number. ");
                lastIndex = input.nextInt();
            }while(lastIndex != list.length - 1);
        }
        System.out.println("correct index number is " + (list.length - 1));
        System.out.println("you entered " + lastIndex);
        if(list.length - 1 == lastIndex){
            System.out.println("great job");
        }
        else{
            System.out.println("your program is not correct");
        }
    }
}
