package enumeracoes_composicao.composicao;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departamentoName = sc.nextLine();

        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary: ");
        double workerbaseSalary = sc.nextDouble();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerbaseSalary, new Departament(departamentoName));

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Enter contract #"+ (i + 1) +" data: ");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contrateDate = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            Double valorPorHoras = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contrateDate, valorPorHoras, hours);
            worker.addContracts(contract);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY):  ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2)) ;
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.geString());
        System.out.println("Departament: " + worker.getDepartament().getName());
        System.out.printf("Income for %s: %.2f", monthAndYear, worker.income(year, month));

        sc.close();
        
    }
}
