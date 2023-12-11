package Outrostopicosbasicos;

import java.util.Scanner;

public class Funcoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        // if (a > b && a > c) {
        //     System.out.println("Higher = " + a);
        // } else if(b > c) {
        //     System.out.println("Higher = " + b);
        // }else{
        //     System.out.println("Higher = " + c);
        // }

        int higher = max(a, b, c);

        ShowRest(higher);

        sc.close();
    }

    public static int max(int a, int b, int c){
        int aux;
        if (a > b && b > c) {
            aux = a;
        } else if (b > c) {
            aux = b;
        }else{
            aux = c;
        }
        return aux;
    }

    public static void ShowRest(int value){
        System.out.println("Higher = " + value);
    }

}
