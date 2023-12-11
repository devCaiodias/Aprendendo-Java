package Programacaoorientadaaobjetos.Staticc;

public class Dollar {
    public static double IOF = 0.06;

    public static double dolarTotalReais(double anomino, double dolarPrice){
        return anomino * dolarPrice * (1.0 + IOF);
    }
}
