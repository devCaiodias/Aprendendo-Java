package construtores_this_sobrecarga_encapsulamento.Bancoconta;

import java.util.Locale;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ContaBanco conta = new ContaBanco();

        System.out.print("Enter account number: ");
        conta.setNumeroConta(sc.nextInt());
        System.out.print("Enter account holder: ");
        conta.setName(sc.next());
        System.out.println();
        System.out.print("Is there na initial deposit (y/n)? ");
        char resp = sc.next().charAt(0);
        if (resp != 'n') {
            System.out.print("Enter initial deposit value: ");
            conta.setBalance(sc.nextDouble());  
        }

        System.out.println("Account data:");
        System.out.println(conta.ToString());

        System.out.print("Enter a deposit value: ");
        conta.depositarConta(sc.nextDouble());
        System.out.println(conta.ToString());

        System.out.print("Enter a withdraw value: ");
        conta.sacarDeposito(sc.nextDouble());
        System.out.println(conta.ToString());

        sc.close();
    }
}
