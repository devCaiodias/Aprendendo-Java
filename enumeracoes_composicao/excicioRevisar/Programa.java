package enumeracoes_composicao.excicioRevisar;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Programa {
    public static void main(String[] args) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comente c1 = new Comente("Have a nice trip!");
        Comente c2 = new Comente("Wow that's awesome!");

    Posts p1 = new Posts(
        sdf.parse("21/06/2018 13:05:44"),
        "Traveling to New Zealand",
        "I'm going to visit this wonderful country!",
        12);
        p1.addComente(c1);
        p1.addComente(c2);

        Comente c3 = new Comente("Good night");
        Comente c4 = new Comente("May the Force be with you");

        Posts p2 = new Posts(
            sdf.parse("28/07/2018 23:14:19"),
            "Good night guys",
            "See you tomorrow",
            5);
            p2.addComente(c3);
            p2.addComente(c4);


            System.out.println(p1);
            System.out.println(p2);

        
    }
}
