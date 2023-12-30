package Interfacess.ProblemaExemplo.entities;


public class Invoice {
    
    private Double basicPayment;
    private Double tax;

    public Invoice(){}

    public Invoice(Double basic, Double tax){
        this.basicPayment = basic;
        this.tax = tax;
    }

    public Double getBasicPayment(){
        return basicPayment;
    }

    public void setBasicPayment(Double basic){
        this.basicPayment = basic;
    }
    
    public Double getTax(){
        return tax;
    }

    public void setTax(Double tax){
        this.tax = tax;
    }

    public Double totalPayment(){
        return getBasicPayment() + getTax();
    }
}
