package estruturasrepetitivas;

import java.util.Scanner;

public class Whileee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int x = sc.nextInt();

        // int soma = 0;

        // while (x != 0) {
        //     soma += x;
        //     x  = sc.nextInt();
        // }

        // System.out.println(soma);

        int d = 0;
        int y = 4;

        while (d < 3) {
            y = y + 2;
            d = d + 1; 
            System.out.println(d + "-" + y);
        }



        sc.close();

    }
}
