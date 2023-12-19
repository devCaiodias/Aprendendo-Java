package Tratamentodeexcecoes.execicioFixicao;

import java.util.Locale;
import java.util.Scanner;

import Tratamentodeexcecoes.execicioFixicao.model.ErrorException;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta = new Conta();

        try {
            System.out.println("Enter account data ");
            System.out.print("Number: ");
            conta.setNumero(sc.nextInt());
            System.out.print("Holder: ");
            sc.nextLine();
            conta.setName(sc.nextLine());
            System.out.print("Initial balance: ");
            conta.setDinheiro(sc.nextDouble());
            System.out.print("Withdraw limit: ");
            conta.setRetirarlimit(sc.nextDouble());
            System.out.println();
    
            System.out.print("Enter amount for withdraw: ");
            conta.retirar(sc.nextDouble());
            System.out.printf("New balance: %.2f",conta.getDinheiro());
            
        } 
        catch (ErrorException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }

        sc.close();
    }
}
