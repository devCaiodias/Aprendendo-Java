package Herancaepolimorfismo.execicioFixicao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<Produto> list = new ArrayList<>();


        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Product #"+ (i + 1) + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char comovcquer = sc.next().charAt(0);
            System.out.print("Name: ");
            String nome = sc.next();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            if (comovcquer == 'i') {
                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();
                list.add(new ProdutoImportante(nome, price, customsFee)); 
            }
            if (comovcquer == 'c') {
                list.add(new Produto(nome, price));
            }
            if (comovcquer == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufacture = sdf.parse(sc.next());
                list.add(new ProdutoUsado(nome, price, manufacture));
            }
            
        }
        
        System.out.println("PRICE TAGS: ");
        System.out.println(list.toString());
        sc.close();;
    }
}
