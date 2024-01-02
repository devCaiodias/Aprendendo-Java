package GenericsSetMap.Generics.application;

import java.util.Scanner;
import GenericsSetMap.Generics.entities.PrintService;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        PrintService<Integer> ps = new PrintService<>();

        System.out.print("How many values? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();
        System.out.println("First: " + ps.fist());

        sc.close();
        
    }

    
}
