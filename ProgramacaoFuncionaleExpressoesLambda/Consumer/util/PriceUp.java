package ProgramacaoFuncionaleExpressoesLambda.Consumer.util;

import java.util.function.Consumer;

import ProgramacaoFuncionaleExpressoesLambda.Consumer.entities.Produto;

public class PriceUp implements Consumer<Produto> {

    @Override
    public void accept(Produto t) {
       t.setPrice(t.getPrice() * 1.1);
    }
    
}
