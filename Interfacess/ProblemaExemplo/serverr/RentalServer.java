package Interfacess.ProblemaExemplo.serverr;

import java.time.Duration;

import Interfacess.ProblemaExemplo.entities.Invoice;
import Interfacess.ProblemaExemplo.entities.Locadora;

public class RentalServer {
    private Double pricePerH;
    private Double pricePerD;

    private BrazilTaxServer taxServer;

    public RentalServer(){

    }
    
    public RentalServer(BrazilTaxServer taxServer,Double priceH, Double priceD){
        this.taxServer = taxServer;
        this.pricePerD = priceD;
        this.pricePerH = priceH;
    }
    

        public void processinvoice(Locadora locadora){

        double minutos =Duration.between(locadora.getRetirada(), locadora.getRetorno()).toMinutes();
        double horas = minutos / 60.0;
        
        double basicPayment;
        if (horas <= 12.0) {
            basicPayment = pricePerH * Math.ceil(horas);
        }
        else{
            basicPayment = pricePerD * Math.ceil(horas / 24.0);
        }

        double tax = taxServer.tax(basicPayment);

            locadora.setInvoice(new Invoice(basicPayment, tax));
        }
}
