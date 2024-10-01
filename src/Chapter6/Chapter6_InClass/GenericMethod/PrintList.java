package GenericMethod;

import java.util.List;

public class PrintList {
    public void PrintList(List<?> list){
        for (Object o: list) {
            System.out.println(o + " ");
        }
        System.out.println();
    }
}

class PrintListTester {
    public static void main(String[] args) {
        PrintList pl = new PrintList();

        List<String> list = List.of("Gabe", "Conor", "Holly");
    }
}
