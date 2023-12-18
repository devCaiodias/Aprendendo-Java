package Herancaepolimorfismo.execicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Funcionario> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" +(i + 1 ) +" data:");
            System.out.print("Outsourced (y/n)? ");
            char outsourcedchar = sc.next().charAt(0);
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Hours: ");
            int hora = sc.nextInt();
            System.out.print("Value per hour: ");
            Double valorHora = sc.nextDouble();
            if (outsourcedchar == 'y') {
                System.out.print("Additional charge: ");
                double additional = sc.nextDouble();
                list.add(new OutsourcedFuncionario(nome, hora, valorHora, additional));
            }else{
                list.add(new Funcionario(nome, hora, valorHora));
            }
        }

        System.out.println();
        System.out.println("PAYMENTS:");
        System.out.println(list.toString());

        sc.close();
    }
}
