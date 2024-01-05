package ProgramacaoFuncionaleExpressoesLambda.Comparator.application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import ProgramacaoFuncionaleExpressoesLambda.Comparator.entities.Produto;

public class Programa {
    public static void main(String[] args) {
        List<Produto> list = new ArrayList<>();
        
        list.add(new Produto("Tv", 900.00));
        list.add(new Produto("Notebook", 1200.00));
        list.add(new Produto("Tablet", 450.00));

        Comparator<Produto> comp = (p1,p2) -> {
            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        };

        list.sort(comp);

        for (Produto p : list) {
            System.out.println(p);
        }
    }
}
