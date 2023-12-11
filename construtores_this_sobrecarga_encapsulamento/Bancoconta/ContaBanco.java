package construtores_this_sobrecarga_encapsulamento.Bancoconta;

public class ContaBanco {
    private int numeroConta;
    private String name;
    private double Balance;
    private double taxa = 5.00;

    public ContaBanco(){
        
    }
    
    public ContaBanco(int numeroConta, String name, double Balance){
        this.name = name;
        this.Balance = Balance;
        this.numeroConta = numeroConta;
    }

    public int getNumeroConta(){
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public double getBalance(){
        return Balance;
    }

    public void setBalance(double Balance){
        this.Balance = Balance;
    }

    public void depositarConta(double valor){
        this.Balance = Balance + valor;
    }

    public void sacarDeposito(double valor){
        this.Balance = Balance - valor - taxa;
    }

    
    public String ToString(){
        return "Account " + getNumeroConta() + ", Holder: " + getName() + ", Balance: $ " + String.format("%.2f", getBalance());
    }

}
