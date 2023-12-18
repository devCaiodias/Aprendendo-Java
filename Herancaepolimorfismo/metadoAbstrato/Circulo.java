package Herancaepolimorfismo.metadoAbstrato;

public class Circulo extends Shape {
    private final static Double Pi(){
        return 3.14159265359;
    }

    private Double radius;

    public Circulo(){
        super();
    }

    public Circulo(Color color, Double radius){
        super(color);
        this.radius = radius;
    }

    public Double getRadius(){
        return radius;
    }

    public void setRadius(Double radius){
        this.radius = radius;
    }
    
    @Override
    public Double area() {
        return Pi() * Math.pow(radius, 2);
    }

    public String toString(){
        return String.format("%.2f", area());
    }
}
