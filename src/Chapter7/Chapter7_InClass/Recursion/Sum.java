package Recursion;

public class Sum {
 //   sum(7)   7 + 6 + 5 + 4 + 3 + 2 + 1
     public static int sum(int n){
        //base case
        if (n <= 0){
            return 0;
        }
        else{
            return n + sum(n - 1);
        }
    }

    public static void main(String[] args) {

    }
}
