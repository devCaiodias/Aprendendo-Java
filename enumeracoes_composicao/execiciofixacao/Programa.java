package enumeracoes_composicao.execiciofixacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter cliente data: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date aniversario = sdf.parse(sc.next());
        Cliente pessoa = new Cliente(nome, email, aniversario);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), status, pessoa);

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter #" +(i + 1) +" item data: ");
            System.out.print("Product name: ");
            sc.nextLine();
            String nomeProduto= sc.nextLine();
            System.out.print("Product price: ");
            Double priceProduto = sc.nextDouble();

            Produtos produtos = new Produtos(nomeProduto, priceProduto);

            System.out.print("Quantity: ");
            int quantidade = sc.nextInt(); 
            
            OrderItems orderItem = new OrderItems(quantidade, priceProduto, produtos);

            order.addOrdemItems(orderItem);
        }

        System.out.println();
        System.out.println("ORDER SUMMARY: ");
        System.out.println(order);


        sc.close();
    
    }
}
