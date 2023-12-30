package Informacoesdocaminhodoarquivo;

import java.io.File;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a file path: ");
        String srtPath = sc.nextLine();

        File path = new File(srtPath);

        System.out.println("getName: " + path.getName());
        System.out.println("getParet: " + path.getParent());
        System.out.println("getPath: " + path.getPath());

        sc.close();
    }
}
