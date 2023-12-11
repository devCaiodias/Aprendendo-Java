import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String nome;

        nome = "caio";
        System.out.println(nome);
        System.out.println("Bom Dia!");
        int numero = 3 + 2 * 4; //11
        
        numero = (3 + 2) * 4;//20

        numero = 60 / (3+2) * 4; // 48

        numero = 60 / ((3+2) * 4); //3
        System.out.println(numero);

        double x = 10.54486;
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", x);
    }   
    
}
