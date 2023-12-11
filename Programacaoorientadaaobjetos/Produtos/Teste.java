package Programacaoorientadaaobjetos.Produtos;

import java.util.Locale;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Price: ");
        Double price = sc.nextDouble();

        Produtos produtos = new Produtos(nome, price);
        produtos.setName("Computador");
        System.out.println("Nome atualizado: " + produtos.getName());
        produtos.setPrice(1200.00);
        System.out.println("Price atualizado: " + produtos.getPrice());



        produtos.TotalValorStock();
        
        System.out.println(produtos.ToString());
        
        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        System.out.print("Adicionar Produto: ");
        produtos.AddProduto(sc.nextInt());
        System.out.println(produtos.ToString());
        
        System.out.println();
        System.out.println("Enter the number of products to be removed from stock: ");
        System.out.print("Remove Produto: ");
        produtos.RemoveProduto(sc.nextInt());
        System.out.println(produtos.ToString());
    }
    
}
