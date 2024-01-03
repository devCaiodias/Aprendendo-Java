package wildcardtypes.boundedwildcards.entities;

public class Retangulo implements Shape {

    private double width;
    private double height;

    public Retangulo(){}

    public Retangulo(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }
    public double getheight(){
        return height;
    }

    public void setheight(double height){
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
    
}
