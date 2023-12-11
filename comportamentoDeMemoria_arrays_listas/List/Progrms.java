package comportamentoDeMemoria_arrays_listas.List;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Progrms {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Caio");
        list.add("Vini");
        list.add("Joao");
        list.add("Carol");
        list.add("Victor");
        list.add(2, "Marcos");

        System.out.println(list.size());

        for (String obj : list) {
            System.out.println(obj);
        }
        System.out.println("-------------------------");
        list.removeIf(obj -> obj.charAt(0) == 'C');
        for (String obj : list) {
            System.out.println(obj);
        }

        System.out.println("--------------------------");
        System.out.println("Index Of Vini: " + list.indexOf("Vini"));
        System.out.println("Index Of Caio: " + list.indexOf("Caio"));

        System.out.println("----------------------------");

        List<String> resultado = list.stream().filter(obj -> obj.charAt(0) == 'V').collect(Collectors.toList());
        for (String obj : resultado) {
            System.out.println(obj);
        }

        System.out.println("---------------------------");
        String nome  = list.stream().filter(obj -> obj.charAt(0) == 'V').findFirst().orElse(null);

        System.out.println(nome);



    }
}
