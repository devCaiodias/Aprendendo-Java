package Interfacess.ProblemaExemplo.application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import Interfacess.ProblemaExemplo.entities.Locadora;
import Interfacess.ProblemaExemplo.entities.Veiculo;
import Interfacess.ProblemaExemplo.serverr.BrazilTaxServer;
import Interfacess.ProblemaExemplo.serverr.RentalServer;

public class Programa {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");

        System.out.print("Modelo do carro: ");
        String nomeCarro = sc.nextLine();
        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime retirada = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime retorno = LocalDateTime.parse(sc.nextLine(), fmt);

        Locadora carRental = new Locadora(new Veiculo(nomeCarro), retirada, retorno);

        System.out.print("Entre com o preço por hora: ");
        Double precoH = sc.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        Double precoD = sc.nextDouble();

        RentalServer rentalServer = new RentalServer(new BrazilTaxServer(), precoH, precoD);

        rentalServer.processinvoice(carRental);

        System.out.println("FATURA: ");
        System.out.println("Pagamento basico: " + String.format("%.2f", carRental.getInvoice().getBasicPayment()));
        System.out.println("Imposto:  " + String.format("%.2f", carRental.getInvoice().getTax()));
        System.out.println("Pagamento total: " + String.format("%.2f", carRental.getInvoice().totalPayment()));




        sc.close();
    }
}
