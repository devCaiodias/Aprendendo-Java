package execicio;

public class Produto {
    private String name;
    private Double preco;
    private int quantidade;

    public Produto(){}

    public Produto(String name, Double preco, int quantidade){
        this.name = name;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Double getPreco(){
        return preco;
    }

    public void setPreco(Double preco){
        this.preco = preco;
    }
    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public Double total(){
        return preco * quantidade;
    }


}
