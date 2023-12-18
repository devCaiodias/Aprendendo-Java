package Herancaepolimorfismo.execicioFixicao2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Tax payer #" + (i + 1) + " data: ");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            String nome = sc.next();
            System.out.print("Anual income: ");
            Double rendaAnual = sc.nextDouble();
            if(ch == 'i'){
                System.out.print("Health expenditures: ");
                Double saude = sc.nextDouble();
                list.add(new Individual(nome, rendaAnual, saude));
            }
            if (ch == 'c') {
                System.out.print("Number of employees: ");
                Integer numeroE = sc.nextInt();
                list.add(new Empresa(nome, rendaAnual, numeroE));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID: ");
        for (TaxPayer t : list) {
            System.out.println(t.toString());
        }

        System.out.println();
        double sum = 0.0;
        for (TaxPayer taxPayer : list) {
            sum += taxPayer.tax();
        }

        System.out.printf("TOTAL TAXES: $ %.2f",sum);

        sc.close();
    }
}
