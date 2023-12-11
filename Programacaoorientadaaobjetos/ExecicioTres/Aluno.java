package Programacaoorientadaaobjetos.ExecicioTres;

public class Aluno {
    public String nome;
    public double nota1, nota2, nota3;

    public double Nota(){
        double total= nota1 + nota2 + nota3;
        return total;
    }

    public double PassFailed(){
        if (Nota() < 60.0) {
            return 60.0 - Nota();
        } else {
            return 0.0;
        }
    }



    public String ToString(){
        return "FINAL GRADE = " + String.format("%.2f", Nota());
    }
}
