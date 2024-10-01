package Ch4Ex1.throwDemo;
/**
 * Bank3
 * handling exceptions for balance and amount to withdraw
 */

import java.util.InputMismatchException;

public class Bank3 {
    private double balance;

    //contrustor which will take balance
    public Bank3(double balance){
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

            java.util.Scanner input = new java.util.Scanner(System.in);
            double balance = -1 ;
            //work for balance
            while(balance < 0 ){
                try{
                    System.out.print("Enter the initial balance: ");
                    balance = input.nextDouble();
                    if(balance < 0){
                        throw new IllegalArgumentException("Initial balance cannot be negative. Please enter it again. ");
                    }
                }catch(IllegalArgumentException e){
                    System.out.println(e.getMessage());
                    input.nextLine();
                }
                catch(InputMismatchException e){
                    System.out.println(e.getMessage());
                    input.nextLine();
                }
            }

            //work for withdrawal

        Bank3 b3 = new Bank3(balance);
        System.out.println(b3.getBalance());

        boolean validInput = false;

        while(!validInput){
            try{
                System.out.print("Enter the amount to withdraw: ");
                double amount = input.nextDouble();

                b3.withdraw(amount);

                System.out.println("Current balance after withdrawal: " + b3.getBalance());
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
