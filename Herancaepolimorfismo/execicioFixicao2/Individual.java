package Herancaepolimorfismo.execicioFixicao2;

public class Individual extends TaxPayer {
    private Double despesaSaude;

    public Individual(){
        super();
    }

    public Individual(String nome, Double rendaAnual, Double despesas){
        super(nome, rendaAnual);
        this.despesaSaude = despesas;
    }

    public Double getDespesa(){
        return despesaSaude;
    }

    public void setDespesa(Double despesa){
        this.despesaSaude = despesa;
    }

    @Override
    public Double tax() {
        return (rendaAnual * 0.25) - (despesaSaude * 0.5);
    }

    public String toString(){
        return getNome() + ": $ " + String.format("%.2f", tax());
    }
}
