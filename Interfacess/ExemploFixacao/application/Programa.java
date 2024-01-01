package Interfacess.ExemploFixacao.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import Interfacess.ExemploFixacao.entities.Contrato;
import Interfacess.ExemploFixacao.entities.Installments;
import Interfacess.ExemploFixacao.server.ContratoServer;
import Interfacess.ExemploFixacao.server.PaypalService;


public class Programa {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre os dados do contrato: ");
        System.out.print("Numero: ");
        int numero = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate data = LocalDate.parse(sc.next(), dtf);
        System.out.print("Valor do contrato: ");
        double valorContrato = sc.nextDouble();
        
        Contrato contrato = new Contrato(numero, data, valorContrato);
        
        System.out.print("Entre com o numero de parcelas: ");
        int n = sc.nextInt();
        ContratoServer service = new ContratoServer(new PaypalService());

        service.processContract(contrato, n);

        System.out.println("Parcelas:");
        for (Installments installments : contrato.geTInstallments()) {
            System.out.println(installments);
        }

        sc.close();
    }
}
