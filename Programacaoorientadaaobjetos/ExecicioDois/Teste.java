package Programacaoorientadaaobjetos.ExecicioDois;

import java.util.Locale;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.print("Nome: ");
        funcionario.nome = sc.nextLine();
        System.out.print("Salario: ");
        funcionario.grossSalario = sc.nextDouble();
        System.out.print("Taxa: ");
        funcionario.taxa = sc.nextDouble();

        System.out.println(funcionario.ToString());
        
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        funcionario.IncreaseSalario(sc.nextDouble());
        System.out.printf("Updated data: %s, $ %.2f", funcionario.nome, funcionario.NetSalario());

    }
}
