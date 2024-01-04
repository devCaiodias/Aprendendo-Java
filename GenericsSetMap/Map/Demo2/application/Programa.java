package GenericsSetMap.Map.Demo2.application;

import java.util.HashMap;
import java.util.Map;

import GenericsSetMap.Map.Demo2.entities.Produto;

public class Programa {
    public static void main(String[] args) {
        Map<Produto, Double> stok = new HashMap<>();

        Produto p1 = new Produto("Tv", 900.0);
        Produto p2 = new Produto("Notebook", 1200.0);
        Produto p3 = new Produto("Tablet", 400.0);

        stok.put(p1, 10000.0);
        stok.put(p2, 20000.0);
        stok.put(p3, 15000.0);
        
        Produto ps = new Produto("Tv", 900.0);

        System.out.println("Contains 'ps' ke: " + stok.containsKey(ps));
    }
}
