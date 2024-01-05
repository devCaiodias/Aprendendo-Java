package ProgramacaoFuncionaleExpressoesLambda.ExecicioFixa.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import ProgramacaoFuncionaleExpressoesLambda.ExecicioFixa.entities.Funcionarios;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Funcionarios> list = new ArrayList<>();

        list.add(new Funcionarios("Maria", "maria@email.com", 3200.00));
        list.add(new Funcionarios("Alex", "alex@email.com", 1900.00));
        list.add(new Funcionarios("Marco", "marco@email.com", 1700.00));
        list.add(new Funcionarios("Bob", "bob@email.com", 3500.00));
        list.add(new Funcionarios("Anna", "anna@email.com", 2800.00));


        System.out.print("Enter salary: ");
        double n = sc.nextDouble();
        
        List<String> emails = list.stream()
        .filter(t -> t.getPrice() > n )
        .map(x -> x.getEmail())
        .sorted()
        .collect(Collectors.toList());
        
        System.out.println("Email of people whose salary is more than " + String.format("%.2f", n) + ":");
        emails.forEach(System.out::println);

        double sum = list.stream()
            .filter(x -> x.getName().charAt(0) == 'M')
            .map(x -> x.getPrice())
            .reduce(0.0, (x, y) -> x + y);
            
            System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));

        sc.close();
    }
}
