package comportamentoDeMemoria_arrays_listas.List.LIstex;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Linstex {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Funcionario> list= new ArrayList<>();

        System.out.print("How many employees will be registered?  ");
        int n = sc.nextInt();


        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Emplyoee #"+ i +":");

            System.out.print("Id: ");
            int id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.print("Id already taken. Try again: ");
                id = sc.nextInt();
            }

            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salary: ");
            double salario = sc.nextDouble();
            list.add(new Funcionario(id, nome, salario));
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase : ");
        int id = sc.nextInt();
        Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("This id does not exist! ");

        }else{
            System.out.print("Enter the percentage: ");
            double percentual = sc.nextDouble();
            emp.increaseSalay(percentual);
        }

        System.out.println();

        System.out.println("List of employees: ");
        for (Funcionario obj : list) {
            System.out.println(obj);
        }

    }

    private static boolean hasId(List<Funcionario> list, int id) {
        Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
