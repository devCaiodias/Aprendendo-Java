package Herancaepolimorfismo.heranca;

public class Programa {
    public static void main(String[] args) {
        // Account acc = new Account(1001,"Caio", 0.0);
        // BusinessAccount bucc = new BusinessAccount(1002, "Vinicius", 0.0, 500.0);

        // //Upcasting

        // Account acc1 = bucc;
        // Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        // Account acc3 = new SevingsAccount(1004, "paloma", 0.0, 0.01);

        // //downcasting

        // BusinessAccount acc4 = (BusinessAccount)acc2;
        // acc4.loan(100.0);

        // // BusinessAccount acc5 = (BusinessAccount)acc3;
        // if (acc3 instanceof BusinessAccount) {
        //     BusinessAccount acc5 = (BusinessAccount)acc3;
        //     acc5.loan(100.0);
        //     System.out.println("Loan!");
        // }

        // if (acc3 instanceof SevingsAccount) {
        //     SevingsAccount acc5 = (SevingsAccount)acc3;
        //     acc5.updadetBalance();
        //     System.out.println("Update!");
        // }


        //Sobreposição, palavra super,anotação @Override
        // Account acc1 = new Account(1002, "Caio", 1000.0);
        // acc1.retirar(200.0);

        // System.out.println(acc1.getBalance());

        // Account acc2 = new SevingsAccount(1445, "Bob", 1000.0, 0.01);
        // acc2.retirar(200.0);
        // System.out.println(acc2.getBalance());

        // Account acc3 = new BusinessAccount(1548, "Vini", 1000.0, 10.0);

        // acc3.retirar(200.0);
        // System.out.println(acc3.getBalance());


        //Polimorfismo
        Account x = new Account(1215, "Alex", 1000.0);
        Account y = new SevingsAccount(1445, "Bob", 1000.0, 0.01);

        x.retirar(50.0);
        y.retirar(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());


    }
}
