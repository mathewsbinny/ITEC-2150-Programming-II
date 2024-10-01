package Ch4Ex1.throwDemo;

import java.util.InputMismatchException;

public class Bank2 {
    //date/attribute  balance - double type
    private double balance;

    //contrustor which will take balance
    public Bank2(double balance){
        this.balance = balance;
    }

    //a getter method for balance
    public double getBalance(){
        return balance;
    }

    //withdraw method
    //how to declare exception. In this case, we will want to declare IllegalArgumentException
    public void withdraw(double amount) throws IllegalArgumentException {
        if(amount < 0){
            throw new IllegalArgumentException("amount cannot be negative value.");
        }
        else if(amount > balance){
            throw new IllegalArgumentException("amount cannot over blance.");
        }
        else{
            balance -= amount;
        }
    }


    public static void main(String[] args) {
        Bank2 b2 = new Bank2(1000); //we have balance set from $1000.00
        System.out.println("Balance: " + b2.getBalance()); //current or original balance or initial balance

        java.util.Scanner input = new java.util.Scanner(System.in);

        boolean validInput = false;
        while(!validInput ){
            try{
                System.out.print("Enter the amount to withdraw: ");
                double amount = input.nextDouble(); //as long as the amount neither a negative amount or larger amount than the balance
                b2.withdraw(amount);
                System.out.println("Balance: " + b2.getBalance());
                validInput = true;
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
                input.nextLine();
            }
            catch(InputMismatchException e){
                System.out.println(e.getMessage());
                input.nextLine();
            }
        }

    }
}
