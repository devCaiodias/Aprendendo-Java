package ProgramacaoFuncionaleExpressoesLambda.Functionn.util;

import java.util.function.Function;

import ProgramacaoFuncionaleExpressoesLambda.Functionn.entities.Produtos;

public class UperCaseName implements Function<Produtos, String> {

    @Override
    public String apply(Produtos t) {
        return t.getName().toUpperCase();
    }
    
}
