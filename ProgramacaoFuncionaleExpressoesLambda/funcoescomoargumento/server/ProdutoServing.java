package ProgramacaoFuncionaleExpressoesLambda.funcoescomoargumento.server;

import java.util.List;
import java.util.function.Predicate;

import ProgramacaoFuncionaleExpressoesLambda.funcoescomoargumento.entities.Produtos;

public class ProdutoServing {
    public double filteredsum(List<Produtos> list, Predicate<Produtos> criteia){
        double sum = 0.0;
        for (Produtos p : list) {
            if (criteia.test(p)) {
                sum += p.getPrice();
            }
        }
        return sum;
    }
}
