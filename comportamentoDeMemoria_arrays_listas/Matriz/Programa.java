package comportamentoDeMemoria_arrays_listas.Matriz;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(mat[i][i] + " ");
        }

        int cont = 0;
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] < 0) {
                    cont++;
                }
            }
        }

        System.out.print("Negative numbers = " + cont);


        sc.close();
    }
}
