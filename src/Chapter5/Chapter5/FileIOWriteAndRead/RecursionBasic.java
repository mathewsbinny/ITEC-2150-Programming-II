package AccessFile.Reading.reverseOrder;

public class RecursionBasic {

    public static void main(String[] args) {

        RecursionBasic rb = new RecursionBasic();
        String x = rb.reverseString("Friday");
        System.out.println(x);

        //Friday
    }

    public String reverseString(String str) {

        System.out.println("Entering:  " + str);
        //base to stop the recursive call
        if (str.isEmpty()) {
            return str;
        } else {
            return reverseString(str.substring(1)) + str.charAt(0);
        }
        //recursive call of the method reverseString
    }
}
