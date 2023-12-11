package comportamentoDeMemoria_arrays_listas.vetor.ex9;

import java.text.ParseException;
import java.util.Scanner;

public class QuartoDeHotel {
    public static void main(String[] args) throws ParseException {
        
        Scanner sc = new Scanner(System.in);
        
        Pessoas[] pessoa = new Pessoas[10];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Rent #" + (i+1)  + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int room = sc.nextInt();
            pessoa[room] = new Pessoas(nome, email);
            
        }

        System.out.println();
        System.out.println("Busy rooms: ");
        for (int i = 0; i < 10; i++) {
            if (pessoa[i] != null) {
                System.out.println(i + ": " + pessoa[i]);
            }
        }

        sc.close();

    }
}
