package Interfacess.Herdarvscumprircontrato.entities;

import Interfacess.Herdarvscumprircontrato.emun.Color;

public class Circulo extends AbstratcShape implements Shape {

    private double radius;

    public Circulo(){}

    public Circulo(Color color, double radius){
        super(color);
        this.radius = radius;
    }

    public double getRadius(){
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
