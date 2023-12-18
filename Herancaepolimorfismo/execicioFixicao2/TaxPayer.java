package Herancaepolimorfismo.execicioFixicao2;

public abstract class TaxPayer {
    private String nome;
    protected Double rendaAnual;

    public TaxPayer(){}

    public TaxPayer(String nome, Double rendaAnual){
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Double getRendaAnual(){
        return rendaAnual;
    }

    public void setRendaAnual(Double rendaAnual){
        this.rendaAnual = rendaAnual;
    }

    public abstract Double tax();
}
