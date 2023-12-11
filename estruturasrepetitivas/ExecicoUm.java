package estruturasrepetitivas;

import java.util.Scanner;

public class ExecicoUm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int i = sc.nextInt();

        while (x > 2) {
            System.out.println(x);
            y += x;
            x -= 1;
        }

        while (x < 60) {
            System.out.println(x);
            x *= 2;
            y+= 10;
        }

        while (x !=y ) {
            System.out.println(x);
            x = (int) Math.sqrt(y);
        }

        while (x < 5) {
            y = x * 3;
            System.out.println(y);
            x = x + 1;
        }
        System.out.println("Fim!");

        System.out.println("Ola");
        while (x < y) {
            System.out.println(x + "-" + y);
            x*=2;
            y+=1;
        }

        while (i < x) {
            i += 1;
            y+=i;
            System.out.print(i);
            System.out.println(y);
        }
        sc.close();
    }
}
