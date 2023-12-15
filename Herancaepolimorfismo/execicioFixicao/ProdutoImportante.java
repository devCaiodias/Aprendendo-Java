package Herancaepolimorfismo.execicioFixicao;

public class ProdutoImportante extends Produto {

    private Double customsFee;

    public ProdutoImportante(){
        super();
    }

    public ProdutoImportante(String nome, Double preco, Double customsFee){
        super(nome, preco);
        this.customsFee = customsFee;
    }

    public Double getCustoms(){
        return customsFee;
    }

    public void setCustoms(Double customs){
        this.customsFee = customs;
    }

    public Double totalPrice(){
        return getPreco() + customsFee;
    }

    @Override
    public String toString(){
        return name + " $" + String.format("%.2f", totalPrice()) + "(Customs fee: $ "+ String.format("%.2f", customsFee) + "\n";
    }

}
