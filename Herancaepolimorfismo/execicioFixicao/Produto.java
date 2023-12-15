package Herancaepolimorfismo.execicioFixicao;

public class Produto {
    protected String name;
    protected Double preco;

    public Produto(){}

    public Produto(String nome, Double preco){
        this.name = nome;
        this.preco = preco;
    }

    public String getNome(){
        return name;
    }

    public void setNome(String nome){
        this.name =nome;
    }

    public Double getPreco(){
    return preco;
    }

    public void setPrico(Double preco){
        this.preco = preco;
    }

    public String priceTag(){
        return name + preco;
    }

    public String toString(){
        return name + " $" + String.format("%.2f", preco) + "\n";
    }


    
}
