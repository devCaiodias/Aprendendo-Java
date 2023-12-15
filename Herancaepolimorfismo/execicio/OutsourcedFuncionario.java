package Herancaepolimorfismo.execicio;

public class OutsourcedFuncionario extends Funcionario {
    private Double additionalCharge;

    public OutsourcedFuncionario(){
        super();
    }

    public OutsourcedFuncionario(String nome, Integer horas, Double valorHoras, Double additionalCharge){
        super(nome, horas, valorHoras);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditional(){
        return additionalCharge;
    }

    public void setAdditional(Double additional){
        this.additionalCharge = additional;
    }

    @Override
    public double pagamento(){
        return super.pagamento() + additionalCharge * 1.1;
    }

    public String toString(){
       return super.toString();
    }
}
