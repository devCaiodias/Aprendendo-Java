package ProgramacaoFuncionaleExpressoesLambda.ExecicioResolvido.application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import ProgramacaoFuncionaleExpressoesLambda.ExecicioResolvido.entities.Produtos;

public class Programa {
    public static void main(String[] args) {
        List<Produtos> list = new ArrayList<>();

        list.add(new Produtos("Tv", 900.00));
        list.add(new Produtos("Mouse", 50.00));
        list.add(new Produtos("Tablet", 350.50));
        list.add(new Produtos("HD Case", 80.90));
        list.add(new Produtos("Computer", 850.00));
        list.add(new Produtos("Monitor", 290.00));

        double avg = list.stream()
        .map(x -> x.getPrice())
        .reduce(0.0, (x,y) -> x + y) / list.size();

        System.out.println("Average price: " + String.format("%.2f", avg));

        Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

        List<String> names =list.stream()
        .filter(p -> p.getPrice() < avg)
        .map(p -> p.getName())
        .sorted(comp.reversed())
        .collect(Collectors.toList());

        for (String n : names) {
            System.out.println(n);
        }
    }
}
