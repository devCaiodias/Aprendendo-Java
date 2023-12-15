package Herancaepolimorfismo.heranca;

public class SevingsAccount extends Account {
    private Double interestRate;

    public SevingsAccount(){
        super();
    }

    public SevingsAccount (Integer number, String holder, Double balance, Double interestRate){
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate(){
        return interestRate;
    }

    public void setinterestRate(Double interestRate){
        this.interestRate = interestRate;
    }

    public void updadetBalance(){
        balance += balance * interestRate;
    }

    @Override //Sobreposição de métado
    public void retirar(Double quantidade){
        balance -= quantidade;
   }
}
