package wildcardtypes.boundedwildcards.application;

import java.util.ArrayList;
import java.util.List;

import wildcardtypes.boundedwildcards.entities.Circulo;
import wildcardtypes.boundedwildcards.entities.Retangulo;
import wildcardtypes.boundedwildcards.entities.Shape;

public class Programa {
    public static void main(String[] args) {
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Retangulo(3.0, 2.0));
        myShapes.add(new Circulo(2.0));

        List<Circulo> myCirculos = new ArrayList<>();
        myCirculos.add(new Circulo(2.0));
        myCirculos.add(new Circulo(3.0));

        System.out.println("Total areas: " + String.format("%.2f", totalArea(myCirculos)));
    }

    public static double totalArea(List<? extends Shape> list){
        double sum = 0.0;
        for (Shape s : list) {
            sum += s.area();
        }
        return sum;
    }
}
