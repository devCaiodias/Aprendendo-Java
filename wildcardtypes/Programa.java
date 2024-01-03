package wildcardtypes;

import java.util.Arrays;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);

        List<String> myStrg = Arrays.asList("Maria", "Caio", "Bob");
        printList(myStrg);
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
