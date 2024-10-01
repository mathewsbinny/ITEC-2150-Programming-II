package Ch4Ex1.throwDemo;

public class CalculatorThrow {

    public int divide(int numerator, int denominator){
        if(denominator == 0){
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return numerator / denominator;
    }


    public static void main(String[] args) {

        CalculatorThrow ct = new CalculatorThrow();
         try{
            int result = ct.divide(10,0);
            System.out.println(result);
          }catch(ArithmeticException e){
            System.out.println(e.getMessage());
          }
    }
}
