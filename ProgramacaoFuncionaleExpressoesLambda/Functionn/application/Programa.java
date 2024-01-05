package ProgramacaoFuncionaleExpressoesLambda.Functionn.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ProgramacaoFuncionaleExpressoesLambda.Functionn.entities.Produtos;

public class Programa {
    public static void main(String[] args) {
        List<Produtos> list = new ArrayList<>();
        list.add(new Produtos("Tv", 900.00));
        list.add(new Produtos("Mouse", 50.00));
        list.add(new Produtos("Tablet", 350.50));
        list.add(new Produtos("HD Case", 80.90));

       // Function<Produtos, String> func = p -> p.getName().toUpperCase();

        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

        names.forEach(System.out::println);



    }
}
