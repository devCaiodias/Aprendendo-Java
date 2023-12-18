package Herancaepolimorfismo.execicioFixicao2;

public class Empresa extends TaxPayer {
    private Integer numerosEmpregados;

    public Empresa(){
        super();
    }

    public Empresa(String nome, Double rendaAnual, Integer numeroE){
        super(nome, rendaAnual);
        this.numerosEmpregados = numeroE;
    }

    public Integer getNumeroE(){
        return numerosEmpregados;
    }

    public void setNumeroE(Integer numeroE){
        this.numerosEmpregados = numeroE;
    }

    @Override
    public Double tax() {
        return rendaAnual * 0.14;
    }


    @Override
    public String toString(){
        return getNome() + ": $ " + String.format("%.2f", tax());
    }

}
