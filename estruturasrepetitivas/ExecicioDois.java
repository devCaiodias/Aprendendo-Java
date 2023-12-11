package estruturasrepetitivas;

import java.util.Scanner;

public class ExecicioDois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        // int y = x + 2;
        // for (int i = 0; i < x; i++) {
        //     System.out.print(x + " " + y);
        //     y += i;
        // }

        // for (int i = 0; i < 5; i++) {
        //     y = i - 1;
        //     x = i * 10;
        //     System.out.print(i);
        // }

        for (int i = 0; i < 4; i++) {
            System.out.print(i + " ");
            y+=i;
            System.out.println(y);
        }

        // for (int i = 0; i < x; i++) {
        //     System.err.print(i + " ");
        //     System.out.println(x);
        //     y+=10;
        // }

        // for (int i = 0; i < x; i++) {
        //     y += i;
        // }
        // System.out.println(y);

        // for (int i = 0;y < x; i++) {
        //     x -= 2;
        //     y += 2;
        //     System.out.println(i);
        // }
        sc.close();
    }
}
