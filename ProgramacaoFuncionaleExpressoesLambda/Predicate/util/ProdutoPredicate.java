package ProgramacaoFuncionaleExpressoesLambda.Predicate.util;

import java.util.function.Predicate;

import ProgramacaoFuncionaleExpressoesLambda.Predicate.entities.Produto;

public class ProdutoPredicate implements Predicate<Produto> {

    @Override
    public boolean test(Produto t) {
        return t.getPrice() >= 100.0;
    }
    
}
