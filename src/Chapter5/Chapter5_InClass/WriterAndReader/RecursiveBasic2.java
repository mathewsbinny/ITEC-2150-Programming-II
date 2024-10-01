package AccessFile.Reading.reverseOrder;

public class RecursiveBasic2 {

    public static void main(String[] args) {

         RecursiveBasic2 rb = new RecursiveBasic2();
         String result = rb.reverseString("Friday");
        System.out.println(result);

        //Friday
    }

    public String reverseString(String str) {

        System.out.println("Entering:  " + str);
        //base to stop the recursive call
        if (str.isEmpty()) {
            return str;
        } else {
            String reversed =  reverseString(str.substring(1)) + str.charAt(0);
            System.out.println("Returning value: " + reversed);
            return reversed;
        }
        //recursive call of the method reverseString
    }
}
