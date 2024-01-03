package wildcardtypes.boundedwildcards.entities;

public class Circulo implements Shape {
    private double radius;

    public Circulo(){}

    public Circulo(double radius){
        this.radius = radius;
    }

    public double getRadiu(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }


}
