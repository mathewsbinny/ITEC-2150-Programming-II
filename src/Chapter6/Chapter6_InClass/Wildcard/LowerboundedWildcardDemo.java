package Wildcard;

import java.util.List;

//lowerbounded wildcard is <? super subclass>
public class LowerboundedWildcardDemo {
    public void add(List<? super Integer> list) {
        for (Object x: list) {
            list.add((Integer)x);
        }
    }

    public void addInteger(List<? super Integer> list) {
        //can we add Integer type value
        //1 thru 10
        for (int i=1; i<=10; i++) {
            list.add(i);
        }
    }

    public int sum(List<? super Integer> list) {
        int sum=0;
        for(Object x: list) {
            sum += (Integer)x;
        }
        return sum;
    }
}

class LowerboundedTester{
    public static void main(String[] args) {

    }
}
