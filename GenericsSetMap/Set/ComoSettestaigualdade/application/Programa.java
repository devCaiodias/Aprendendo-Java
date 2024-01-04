package GenericsSetMap.Set.ComoSettestaigualdade.application;

import java.util.Set;
import java.util.TreeSet;

import GenericsSetMap.Set.ComoSettestaigualdade.entities.Produtos;

public class Programa {
    public static void main(String[] args) {
        
        Set<Produtos> set = new TreeSet<>();

        set.add(new Produtos("TV", 900.0));
        set.add(new Produtos("Notbook",  1200.0));
        set.add(new Produtos("Tablet",  400.0));

        for (Produtos produtos : set) {
            System.out.println(produtos.toString());
        }
    }
}
