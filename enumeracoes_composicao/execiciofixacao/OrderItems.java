package enumeracoes_composicao.execiciofixacao;

public class OrderItems {
    private Integer quantidade;
    private Double preco;

    private Produtos produtos;

    public OrderItems(){}

    public OrderItems(Integer quantidade, Double price, Produtos produto){
        this.quantidade = quantidade;
        this.preco = price;
        this.produtos = produto;
    }

    public Integer getQuantidade(){
        return quantidade;
    }
    
    public void setQuantidade(Integer quantidade){
        this.quantidade = quantidade;
    }

    public Double getPreco(){
        return preco;
    }

    public void setPrece(Double prece){
        this.preco = prece;
    }
    
    public Produtos getProdutos(){
        return produtos;
    }

    public void setProdutos(Produtos produto){
        this.produtos = produto;
    }


    public Double subTotal(){
        return preco * quantidade;
    }

    @Override
    public String toString(){
        return produtos.getNomeProduto() + ", $" + preco + ", Quantidade: " + quantidade + ", subTotal: $" + String.format("%.2f", subTotal());
    }
}
