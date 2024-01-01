package Interfacess.ExemploFixacao.entities;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



public class Installments {
    
    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private LocalDate dueDate;
    private Double amount;

    public Installments(){}

    public Installments(LocalDate dueDate, Double amount){
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public LocalDate getDueDate(){
        return dueDate;
    }

    public void setDuedata(LocalDate dueDate){
        this.dueDate = dueDate;
    }

    public Double getAmount(){
        return amount;
    }

    public void setAmount(Double amount){
        this.amount = amount;
    }

    public String toString(){
        return dueDate.format(dtf) + " - " + String.format("%.2f", amount);
    }
}
