package DataHorario.Instanciação;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Programa {
    public static void main(String[] args) {
        //Data-[hora] local:
        LocalDate d01 = LocalDate.now();  
        LocalDateTime d02 = LocalDateTime.now();
        
        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        
        System.out.println("------------------------------");

        //Data-hora global:
        Instant d03 = Instant.now();

        System.out.println("d03 = " + d03);

        System.out.println("------------------------------");

        //Texto ISO 8601:
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T12:56:36");
        Instant d06 = Instant.parse("2022-07-20T12:56:36Z");

        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);

        System.out.println("------------------------------");

        //Texto formato customizado
        //https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d07 = LocalDate.parse("20/07/2022", fmt1);

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime d08 = LocalDateTime.parse("20/07/2022 01:30", fmt2);

        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);

            System.out.println("------------------------------");

        //dia, mês, ano, [horário]

        LocalDate d09 = LocalDate.of(2020, 7, 22);
        LocalDateTime d10 = LocalDateTime.of(2020, 7, 22, 1, 30);

        System.out.println("d09 = " + d09);
        System.out.println("d10 = " + d10);
    }
}
