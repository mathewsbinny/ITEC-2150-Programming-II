package ExceptionHandlingDemo.sep25.NullPointerExceptionDemo;

/**
 * NullPointerException demo
 */
public class StringNullPointerExceptionDemo {

    public static void main(String[] args) {
        String[] x = {"Five", null, "Four"};

        int lengthOftheArray = x.length;

        System.out.println(lengthOftheArray);
//        for(int i = 0; i < x.length; i++){
//            int[] alist = new int[x.length];
//            alist[i] = x[i].length();
//        }

        for(String str: x){
            try {
                int lengthOFStringElement = str.length();

                System.out.println("Length of String Element is " + lengthOFStringElement);
            }catch(NullPointerException e){

            }

        }


    }
}
