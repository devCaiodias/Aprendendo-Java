package FileWritereBufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Programa {
    public static void main(String[] args) {
        String[] lines = new String[] {
            "Good Moning",
            "Good Afterno",
            "Good Night"
        };
        String path = "C:\\Users\\caiod\\OneDrive\\Área de Trabalho\\Java\\Trabalhandocomarquivos\\good.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
