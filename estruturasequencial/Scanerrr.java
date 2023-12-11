package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class Scanerrr {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String x;
        x = sc.next();
        System.out.println("Vc dijitou o valor " + x);

        int y;
        y = sc.nextInt();
        System.out.println("Valor dijitado: " + y);

        double t;
        t = sc.nextDouble();
        System.out.println("valor double: " + t);

        char l;
        l = sc.next().charAt(0);
        System.out.println("Seu caracteres e " + l);

        int e;
        String s1, s2, s3;

        e = sc.nextInt();
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados Dijitados: ");
        System.out.println(e);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
        
    }
}
