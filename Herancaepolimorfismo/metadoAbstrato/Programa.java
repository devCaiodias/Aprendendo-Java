package Herancaepolimorfismo.metadoAbstrato;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Shape #"+ (i + 1) + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());
            if (ch == 'r') {
                System.out.print("Width: ");
                Double largura = sc.nextDouble();
                System.out.print("Height: ");
                Double altura = sc.nextDouble();
                list.add(new Retangulo(color, largura, altura));
            }
            if (ch == 'c') {
                System.out.print("Radius: ");
                Double radius = sc.nextDouble();
                list.add(new Circulo(color, radius));
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS:");
        for (Shape s : list) {
            System.out.println(s.toString());
        }


        sc.close();
    }
}
