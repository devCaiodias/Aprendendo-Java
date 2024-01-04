package GenericsSetMap.Set.ExecicioFixacao.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> set = new HashSet<>();

        System.out.print("How many students for course A? ");
        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            set.add(sc.nextInt());
        }
        System.out.print("How many students for course B? ");
        int b = sc.nextInt();

        for (int i = 0; i < b; i++) {
           set.add(sc.nextInt());
        }
        
        System.out.print("How many students for course C? ");
        int c = sc.nextInt();
        
        for (int i = 0; i < c; i++) {
            set.add(sc.nextInt());
        }

        System.out.print("Total students: " + set.size());

        sc.close();
    }
}
