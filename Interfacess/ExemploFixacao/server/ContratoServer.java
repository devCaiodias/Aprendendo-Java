package Interfacess.ExemploFixacao.server;

import java.time.LocalDate;

import Interfacess.ExemploFixacao.entities.Contrato;
import Interfacess.ExemploFixacao.entities.Installments;

public class ContratoServer {


    private OnlinePaymentService onlinePaymentService;

    public ContratoServer(OnlinePaymentService onlinePaymentService){
        this.onlinePaymentService = onlinePaymentService;
    }
    
    public void processContract(Contrato contrato, int months){
      double pacelas = contrato.getTotalValue() / months;
      for (int i = 1; i <= months; i++) {
        LocalDate date = contrato.getDate().plusMonths(i);
        double interest = onlinePaymentService.interest(pacelas, i);
        double fee = onlinePaymentService.paymentFee(pacelas + interest);
        double quote = pacelas + interest + fee;
        contrato.geTInstallments().add(new Installments(date, quote));
      }
    }



}
