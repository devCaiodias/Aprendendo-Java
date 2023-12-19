package Tratamentodeexcecoes.metadologia;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Finally {
    public static void main(String[] args) {
        
        File file = new File("C:\\Users\\caiod\\OneDrive\\Área de Trabalho\\Java\\Tratamentodeexcecoes\\metadologia\\caio.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error opening file: " + e.getMessage());
        }
        finally{
            if (sc != null) {
                sc.close();
            }
        }
    }
}
