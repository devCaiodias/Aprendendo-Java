package Programacaoorientadaaobjetos.ExecicioDois;

public class Funcionario {
    public String nome;
    public double grossSalario;
    public double taxa;

    public double NetSalario(){
        return grossSalario - taxa;
    }

    public void IncreaseSalario(double percentage){
        grossSalario += grossSalario * percentage / 100.0;
    }

    public String ToString(){
        return "Employee: " + nome + ", $ " + String.format("%.2f", NetSalario());
    }
}
