package Herancaepolimorfismo.execicioFixicao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto{
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date manufactureDate;


    public ProdutoUsado(){
        super();
    }

    public ProdutoUsado(String nome, Double preco, Date manufatura){
        super(nome, preco);
        this.manufactureDate = manufatura;
    }

    public Date getManufatura(){
        return manufactureDate;
    }

    public void setManufatura(Date manufatura){
        this.manufactureDate = manufatura;
    }

    @Override
    public String priceTag(){
        return name + preco;
    }

    @Override
    public String toString(){
        return name +" (used) " + " $" + String.format("%.2f", preco) + " (Manufacture date: "+ sdf.format(manufactureDate) + ") " + "\n";
    }
}
