package Programacaoorientadaaobjetos.Produtos;

public class Produtos {
    private String nome;
    private double price;
    private int quantidade;


    //SobreCarga
    public Produtos(){
        
    }
    //Construtor
    public Produtos(String nome, double price, int quantidade){
        this.nome = nome;
        this.price = price;
        this.quantidade = quantidade;
    }

    public Produtos(String nome, double price){
        this.nome = nome;
        this.price = price;
    }

    //Encapsulamento
    public void setName(String nome){
        this.nome = nome;
    }

    public String getName(){
        return nome;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    public Double getPrice(){
        return price;
    }

    public int getQuantidade(){
        return quantidade;
    }

    //Metados
    public double TotalValorStock(){
        double total = price  * quantidade;
        return total;
    }

    public void AddProduto(int value){
        quantidade = quantidade + value;
    }

    public void RemoveProduto(int value){
        quantidade = quantidade - value;
    }

    public String ToString(){
        return getName() + ", $ " + String.format("%.2f", getPrice()) + ", " + getQuantidade() + " unidades, Total: " + String.format("%.2f", TotalValorStock()); 
    }
}
