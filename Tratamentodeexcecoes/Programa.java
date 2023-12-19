package Tratamentodeexcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        
        metado1();

        System.out.println("End Fim");
    }
    
    public static void metado1(){
        System.out.println("-------------METADO 1 INICIO-----------");
        metado2();
        System.out.println("-------------METADO 1 END-----------");
    }
    public static void metado2(){
        System.out.println("-------------METADO 2 INICIO-----------");
        Scanner sc = new Scanner(System.in);
        
        try {
            String[] vetc = sc.nextLine().split(" ");
            int posicion = sc.nextInt();
            System.out.println(vetc[posicion]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalido a posiçao");
            e.printStackTrace();
            sc.next();
        }
        catch(InputMismatchException e){
            System.out.println("N pode colocar letras aki ");
        }
        
        sc.close();
        System.out.println("-------------METADO 2 END-----------");
    }
}
