package Outrostopicosbasicos;

public class Splitt {
    public static void main(String[] args) {
        String s = "potat oapple lemon";

        String[] vect = s.split(" ");

        for (int i = 0; i < 3; i++) {
            System.out.println(vect[i]);
        }
    }
}
