package DataHorario.Calculos;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Programa {
    public static void main(String[] args) {

        //Cálculos com data-hora
        
        //Data-hora +/- tempo ➞ Data-hora
        
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate semanaAnterior = d04.minusDays(7);
        LocalDate semanaProxima = d04.plusDays(7);
        
        System.out.println("semanaAnterior = " + semanaAnterior);
        System.out.println("semanaProxima = " + semanaProxima);

        System.out.println("--------------------------------------------------------");
        
        LocalDateTime semanaAnteriorTime = d05.minusDays(7);
        LocalDateTime semanaProximaTime = d05.plusDays(7);
        
        System.out.println("semanaAnteriorTime = "+ semanaAnteriorTime);
        System.out.println("semanaProximaTime = " + semanaProximaTime);
        
        Instant semanaAnteriorInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant semanaProximaInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("-----------------------------");
        System.out.println("semanaAnteriorInstant = " + semanaAnteriorInstant);
        System.out.println("semanaProximaInstant = " + semanaProximaInstant);
        
        System.out.println("-----------------------------");

        //Data-hora 1, Data-hora 2 ➞ Duração

        Duration t1 = Duration.between(semanaAnterior.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(semanaAnteriorTime, d05);
        Duration t3 = Duration.between(semanaAnteriorInstant, d06);
        Duration t4 = Duration.between(d06, semanaAnteriorInstant);

        System.out.println("t1 dias = "+ t1.toDays());
        System.out.println("t2 dias = "+ t2.toDays());
        System.out.println("t3 dias = "+ t3.toDays());
        System.out.println("t4 dias = "+ t4.toDays());
    }
}
