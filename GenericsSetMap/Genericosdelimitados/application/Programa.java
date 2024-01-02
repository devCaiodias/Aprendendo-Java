package GenericsSetMap.Genericosdelimitados.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import GenericsSetMap.Genericosdelimitados.entities.Product;
import GenericsSetMap.Genericosdelimitados.service.CalculationService;

public class Programa {
    public static void main(String[] args) {
         List<Product> list = new ArrayList<>();

         String path = "C:\\Users\\caiod\\OneDrive\\Área de Trabalho\\Java\\GenericsSetMap\\Genericosdelimitados\\application\\produto.txt";

         try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                String[] filds = line.split(",");
                list.add(new Product(filds[0], Double.parseDouble(filds[1])));
                line = br.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.println("Most expensive: ");
            System.out.println(x);
         } catch (Exception e) {
            // TODO: handle exception
         }
    }
}
