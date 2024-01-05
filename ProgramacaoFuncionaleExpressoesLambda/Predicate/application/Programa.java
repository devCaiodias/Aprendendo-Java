package ProgramacaoFuncionaleExpressoesLambda.Predicate.application;

import java.util.ArrayList;
import java.util.List;

import ProgramacaoFuncionaleExpressoesLambda.Predicate.entities.Produto;

public class Programa {
    public static void main(String[] args) {
        List<Produto> list = new ArrayList<>();
        list.add(new Produto("Tv", 900.00));
        list.add(new Produto("Mouse", 50.00));
        list.add(new Produto("Tablet", 350.50));
        list.add(new Produto("HD Case", 80.90));

      //  Predicate<Produto> predt = p -> p.getPrice() >= 100.0;


        list.removeIf(p -> p.getPrice() >= 100.0);

        for (Produto p : list) {
            System.out.println(p);
        }
    }
}
