package Herancaepolimorfismo.metadoAbstrato;

public class Retangulo extends Shape {
    private Double largura;
    private Double altura;
    
    public Retangulo(){
        super();
    }

    public Retangulo(Color color, Double largura, Double altura){
        super(color);
        this.altura = altura;
        this.largura = largura;
    }

    public Double getlargura(){
        return largura;
    }

    public void setlargura(Double largura){
        this.largura = largura;
    }

    public Double getaltura(){
        return altura;
    }

    public void setaltura(Double altura){
        this.altura = altura;
    }

    @Override
    public Double area() {
        return largura * altura;
    }

    public String toString(){
        return String.format("%.2f", area());
    }
}
