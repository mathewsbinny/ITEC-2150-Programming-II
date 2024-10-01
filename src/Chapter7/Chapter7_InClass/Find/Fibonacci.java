package Recursion;

/**
 * Fibonacci.java
 * focus: base case.
 * make sure trace down to see how recursive call works.
 */
public class Fibonacci {
    public static int fibonacci(int n){

        if(  n <= 1 ){ //or n < 2

            return n;
        }
        else{

            int result = fibonacci(n - 1) + fibonacci(n - 2);

            return result;
        }
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(5)); //1 1 2 3 5
    }


}
