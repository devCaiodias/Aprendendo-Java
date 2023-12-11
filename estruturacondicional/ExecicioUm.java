package estruturacondicional;

import java.util.Scanner;

public class ExecicioUm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       // System.out.println("Qual é seu numero?");
        //int numero = sc.nextInt();

        //Exercício 01
        // if (numero < 0) {
        //     System.out.println("Negativo");
        // } else {
        //     System.out.println("Nao Negativo");
        // }

        //Exercício 02
        // if (numero % 2 == 0) {
        //     System.out.println("Par");
        // }else {
        //     System.out.println("Impar");   
        // }

        //Exercício 03
        // System.out.println("Numero a: ");
        // int a = sc.nextInt();
        // System.out.println("Numero b: ");
        // int b = sc.nextInt();

        // if (a % b == 0 || b % a == 0) {
        //     System.out.println("Simm ele é mutiplo");
        // } else {
        //     System.out.println("Nao é multiplo.");
        // }


        int x = sc.nextInt();
        String dia;

        switch (x) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segenda";
            break;
            case 3:
                dia = "Terça";
            break;
            case 4:
                dia = "Quarta";
            break;
            case 5:
                dia = "Quinta";
            break;
            case 6:
                dia = "Sexta";
            break;
            default:
                dia = "Semana invalida!";
                break;
        }

        System.out.printf("Qual dia da semana:  %s ", dia);

        sc.close();
    }
}
