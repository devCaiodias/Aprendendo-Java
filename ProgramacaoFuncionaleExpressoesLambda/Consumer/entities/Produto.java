package ProgramacaoFuncionaleExpressoesLambda.Consumer.entities;

public class Produto {
    private String name;
    private Double price;
    public Produto(String name, Double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    public static void staticPriceUp(Produto p){
        p.setPrice(p.getPrice() * 1.1);
    }
    
    public void nonStaticPriceUp(){
        price = price * 1.1;
    }
    @Override
    public String toString() {
        return "Produto [ name = " + name + ", price = " + String.format("%.2f", price) + " ]";
    }

    
}
