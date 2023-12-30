package Interfacess.ProblemaExemplo.entities;

import java.time.LocalDateTime;

public class Locadora extends Invoice {

    private LocalDateTime retirada;
    private LocalDateTime retorno;

    private Veiculo veiculo;
    private Invoice invoice;

    public Locadora(){}

    public Locadora(Veiculo veiculo, LocalDateTime retirarda, LocalDateTime retorno){
        this.retirada = retirarda;
        this.retorno = retorno;
        this.veiculo = veiculo;
        
    }

    public LocalDateTime getRetirada(){
        return retirada;
    }

    public void setRetirada (LocalDateTime retirada){
        this.retirada = retirada;
    }

    public LocalDateTime getRetorno(){
        return retorno;
    }

    public void setRetorno (LocalDateTime retorno){
        this.retorno = retorno;
    }

    public Invoice getInvoice(){
        return invoice;
    }

    public void setInvoice(Invoice invoice){
        this.invoice = invoice;
    }

    public Veiculo getVeiculo(){
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo){
        this.veiculo = veiculo;
    }
    
}
