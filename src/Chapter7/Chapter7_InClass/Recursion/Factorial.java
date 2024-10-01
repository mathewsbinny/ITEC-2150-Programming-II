package Recursion;

import java.math.BigInteger;

public class Factorial {

    public static int factorial(int n){

        //base case
        if(n == 0 || n == 1){
            System.out.println("BASE CASE or STOPPING CASE. It means the recursive call reached down to factorial(0)");
            return 1;
        }
        //recursive call
        else{
            System.out.println("Entering factorial(" + n + ")");
            int result = n * factorial(n - 1);
            System.out.println("Exiting factorial (" + n + ")");
            return result;
        }

    }

    public static long factorialLong(int n){
        if(n < 0){
            throw new IllegalArgumentException(n + " cannot be a negative value");
        }
        long result = 1;
        for(int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }
    public static <T extends Number> long factorialLongGeneric(T n){

        int intValue = n.intValue();

        if(intValue < 0){
            throw new IllegalArgumentException(n + " cannot be a negative value");
        }
        long result = 1;
        for(int i = 1; i <= intValue; i++){
            result *= i;
        }
        return result;
    }



    public static BigInteger factorialBI(int n){
        if(n < 0){
            throw new IllegalArgumentException(n + " cannot be a negative number");
        }
        BigInteger result = BigInteger.ONE;

        for(int i = 1; i <= n; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
    public static void main(String[] args) {
        int n = 5;
      int output =   factorial(n);
        System.out.println("factorial(" + n + ") is " + output);
    }
}
