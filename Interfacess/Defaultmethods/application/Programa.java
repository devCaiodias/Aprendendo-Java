package Interfacess.Defaultmethods.application;

import java.util.Locale;
import java.util.Scanner;

import Interfacess.Defaultmethods.entities.BrazilInterestTax;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantia: ");
        double amount = sc.nextDouble();
        System.out.print("Meses: ");
        int mes = sc.nextInt();

        BrazilInterestTax tax = new BrazilInterestTax(1.0);
        double payment = tax.pament(amount, mes);

        System.out.println("Pagamento apos " + mes + " meses:");
        System.out.println(String.format("%.2f", payment));



        sc.close();
    }
}
