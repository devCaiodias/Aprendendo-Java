package Outrostopicosbasicos;

import java.util.Scanner;

public class Bitwisse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n1 = 89;
        // int n2 = 60;

        // System.out.println(n1 & n2);
        // System.out.println(n1 | n2);
        // System.out.println(n1 ^ n2);

        int mesk = 0b100000;
        int n = sc.nextInt();
        
        if ((n & mesk) != 0) {
            System.out.println("6 bit is true!");            
        } else {
            System.out.println("6 bit is false!");
        }

        sc.close();
    }
}