package enumeracoes_composicao.execiciofixacao;

public class Produtos {
    private String nome;
    private Double preci;

    public Produtos(){}

    public Produtos(String nome, Double price){
        this.nome = nome;
        this.preci = price;
    }

    public String getNomeProduto(){
        return nome;
    }

    public void setNomeProduto(String nome){
        this.nome = nome;
    }

    public Double getPriceProduto(){
        return preci;
    }

    public void setPricePrdutos(Double price){
        this.preci = price;
    }
}
