package Wildcard;

import java.util.List;

public class UpperboundedWildcardDemo {
    public long factorial(List<? extends Number> list) {

        long result = 1;
        for(int i=1; i<10; i++){
            result *= list.get(i).longValue();
        }

        return result;
    }
}
