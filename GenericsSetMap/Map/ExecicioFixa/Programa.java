package GenericsSetMap.Map.ExecicioFixa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            Map<String, Integer> mat = new HashMap<>(); 

            String line = br.readLine();

            while (line != null) {
                String[] filds = line.split(",");
                String name = filds[0];
                int voto = Integer.parseInt(filds[1]);

                if (mat.containsKey(name)) {
                    int votaste = mat.get(name);
                    mat.put(name, voto + votaste);
                }
                else{
                    mat.put(name, voto);
                }
                
                line = br.readLine();
            }

            for (String key : mat.keySet()) {
                System.out.println(key + ": " + mat.get(key));
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }


        sc.close();
    }
}
