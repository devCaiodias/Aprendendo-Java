package Interfacess.Herdarvscumprircontrato.application;

import Interfacess.Herdarvscumprircontrato.emun.Color;
import Interfacess.Herdarvscumprircontrato.entities.AbstratcShape;
import Interfacess.Herdarvscumprircontrato.entities.Circulo;
import Interfacess.Herdarvscumprircontrato.entities.Retangulo;

public class Programa {
    public static void main(String[] args) {
        AbstratcShape s1 = new Circulo(Color.WHITE, 2.0);
        AbstratcShape s2 = new Retangulo(Color.BLACK, 3.0, 4.0);

        System.out.println("Circulo color: " + s1.getColor());
        System.out.println("Circulo area: " + String.format("%.3f", s1.area()));
        
        System.out.println("Retagulo color: " + s2.getColor());
        System.out.println("Retangulo area: " + String.format("%.3f", s2.area()));
        
    }
}
