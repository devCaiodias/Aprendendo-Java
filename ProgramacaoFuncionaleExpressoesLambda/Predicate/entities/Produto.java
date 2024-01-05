package ProgramacaoFuncionaleExpressoesLambda.Predicate.entities;

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

    public static boolean staticProdutoPredicate(Produto p){
        return p.getPrice() >= 100.0;
    }
    
    public boolean nonStaticProdutoPredicate(){
        return price >= 100.0;
    }

    @Override
    public String toString() {
        return name + ", " + price;
    }

    
}
