package Herancaepolimorfismo.heranca;

public class BusinessAccount extends Account {
    private Double limiteEmprestimo;

    public BusinessAccount(){
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double limitiEmprestimo){
        super(number, holder, balance);
        this.limiteEmprestimo = limitiEmprestimo;
    }

    public Double getLimitiE(){
        return limiteEmprestimo;
    }

    public void setLimitiE(Double limiti){
        this.limiteEmprestimo = limiti;
    }

    public void loan(Double quantidade){
        if (quantidade <= limiteEmprestimo) {
            balance += quantidade - 10;
        }
    }

    @Override
    public void retirar(Double quantidade){
        super.retirar(quantidade);
        balance -= 2.0;
    }
}
