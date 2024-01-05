package ProgramacaoFuncionaleExpressoesLambda.funcoescomoargumento.application;

import java.util.ArrayList;
import java.util.List;

import ProgramacaoFuncionaleExpressoesLambda.funcoescomoargumento.entities.Produtos;
import ProgramacaoFuncionaleExpressoesLambda.funcoescomoargumento.server.ProdutoServing;

public class Programa {
    public static void main(String[] args) {
        List<Produtos> list = new ArrayList<>();
        list.add(new Produtos("Tv", 900.00));
        list.add(new Produtos("Mouse", 50.00));
        list.add(new Produtos("Tablet", 350.50));
        list.add(new Produtos("HD Case", 80.90));

        ProdutoServing ps = new ProdutoServing();

        double sum = ps.filteredsum(list, p -> p.getPrice() <= 100);

        System.out.println("Sum: " + String.format("%.2f", sum));

    }
}
