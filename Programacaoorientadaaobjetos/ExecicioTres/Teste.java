package Programacaoorientadaaobjetos.ExecicioTres;

import java.util.Locale;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        aluno.nome = sc.nextLine();
        aluno.nota1 = sc.nextDouble();
        aluno.nota2 = sc.nextDouble();
        aluno.nota3 = sc.nextDouble();

        System.out.println(aluno.ToString());

        if (aluno.Nota() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", aluno.PassFailed());
        } else {
            System.out.println("Pass");
        }


    }
}
