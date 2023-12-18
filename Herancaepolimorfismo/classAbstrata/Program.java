package Herancaepolimorfismo.classAbstrata;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
		List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(15556, "Caio", 500.00, 0.01));
        list.add(new BusinessAccount(14665, "Alex", 1000.00, 400.0));
        list.add(new SavingsAccount(1455, "Bob", 300.00, 0.01));
        list.add(new BusinessAccount(1156, "Diojo", 500.00, 500.0));

        double sum = 0.0;
        for (Account acc : list) {
            sum += acc.getBalance();
        }

        System.out.println(sum);

        for (Account acc : list) {
            acc.deposit(10.0);
        }
        for (Account acc : list) {
            System.out.printf("%.2f%n",acc.getBalance());
        }


	}
}
