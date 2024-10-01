package Ch4Ex1.throwDemo;
import java.util.Scanner;
public class IllegalArgumentExceptionDemo {

    public static void main(String[] args) {
        System.out.println("Answer to the following questions: ");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter eight character: ");
        try{
            String eightCharacter = input.nextLine();
            if(eightCharacter.length() < 8 ){
                throw new IllegalArgumentException("You must enter 8 characgters");
            }
        }catch(IllegalArgumentException e){
            System.out.println(e);
        }
    }
}
