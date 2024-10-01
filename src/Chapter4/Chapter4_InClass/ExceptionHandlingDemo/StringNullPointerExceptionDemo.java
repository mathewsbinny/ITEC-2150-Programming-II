package ExceptionHandlingDemo;

public class StringNullPointerExceptionDemo {
    public static void main(String[] args) {
        String[] x = {"Five", null, "Four"};

        int lengthOfTheArray = x.length;

        System.out.println(lengthOfTheArray);

        for(String str:x) {
            try{
            int lengthOfStringElement = str.length();
            System.out.println("Length of String Element is " + lengthOfStringElement);
            } catch(NullPointerException e) {
                System.out.println(e);
            }
    }
}
