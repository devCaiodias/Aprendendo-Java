package Interfacess.InterfaceComparable.entities;

public class Funcionarios implements Comparable<Funcionarios> {
    private String nome;
    private Double salario;

    public Funcionarios(){}

    public Funcionarios(String nome, Double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Double getSalario(){
        return salario;
    }

    public void setSalario(Double salario){
        this.salario = salario;
    }

    @Override
    public int compareTo(Funcionarios o) {
        return nome.compareTo(o.getNome());
    }
}
