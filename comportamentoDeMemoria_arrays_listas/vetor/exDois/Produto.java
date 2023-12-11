package comportamentoDeMemoria_arrays_listas.vetor.exDois;

public class Produto {
    private String nome;
    private double price;

    public Produto(String nome,double price){
        this.nome = nome;
        this.price = price;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public double getPrice(){
        return price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
}