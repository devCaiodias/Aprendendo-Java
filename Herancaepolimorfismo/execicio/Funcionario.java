package Herancaepolimorfismo.execicio;

public class Funcionario {
    private String nome;
    protected Integer horas;
    protected Double valorHora;

    public Funcionario(){}

    public Funcionario(String nome, Integer horas, Double valorHoras){
        this.nome = nome;
        this.horas = horas;
        this.valorHora = valorHoras;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public Integer getHoras(){
        return horas;
    }

    public void setHoras(Integer horas){
        this.horas = horas;
    }

    public Double getValorHora(){
        return valorHora;
    }

    public void setValorHora(Double valorHora){
        this.valorHora = valorHora;
    }

    public double pagamento(){
        return valorHora * horas;
    }

    public String toString(){
        return nome + " - $ " + String.format("%.2f", pagamento()) + "\n";
    }

}
