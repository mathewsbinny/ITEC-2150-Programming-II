package Ch4Ex1.throwDemo;

/**
 * Bank1
 *
 */
public class Bank1 {
    //date/attribute  balance - double type
    private double balance;

    //contrustor which will take balance
    public Bank1(double balance){
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


    //main method to test.

    public static void main(String[] args) {
        Bank1 b1 = new Bank1(1000);
        System.out.println("Balance: " + b1.getBalance());
        try {
            b1.withdraw(200);
            System.out.println("After withdrawal: " + b1.getBalance());
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

}
