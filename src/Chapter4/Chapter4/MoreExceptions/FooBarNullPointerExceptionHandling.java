package Ch4Ex1.throwDemo;

public class FooBarNullPointerExceptionHandling {

    private String x ;

    public FooBarNullPointerExceptionHandling(String x){
        this.x = x;
    }
    public static void main(String[] args) {
        String x = "abcd";
        FooBarNullPointerExceptionHandling fb = new FooBarNullPointerExceptionHandling(x);

        if(fb != null){
            fb.foo(x);
            fb.bar(x);
        }
        fb.foo(null);
        fb.bar(null);


        fb.foo(x);
        fb.bar(x);
    }

    //foo method by using try-catch
    public void foo(String x){
        try{
            System.out.println("From foo(): " + x.charAt(0));
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }


    //bar method without using try-catch
    public void bar(String x){
        if(x == null){
            System.out.println("From bar(): NullPointerException thrown!");
        }
        else{
            System.out.println("From bar(): " + x.charAt(0));
        }
    }

}
