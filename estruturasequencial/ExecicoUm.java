package estruturasequencial;

import java.util.Locale;

public class ExecicoUm {
    public static void main(String[] args) {
        String produto1 = "Computador";
        String produto2 = "office desk";
        
        int anoPessoa = 30;
        int codigo = 5290;
        char sexo = 'F';
        
        double prece1 = 2100.0;
        double prece2 = 650.50;
        double medir = 53.234567;
        
        System.out.println("Products:");
        System.out.printf("%s which price is $ %f %n",produto1,prece1);
        System.out.printf("%s, which price is $ %f %n",produto2,prece2);

        System.out.printf("%nRecord: %d years old, code %d and gender: %s %n",anoPessoa,codigo,sexo);

        System.out.printf("%nMeasue with eight decimal places: %f%n", medir);
        System.out.printf("Rouded (three decimal places): %.3f%n", medir);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f", medir);
    }
}
