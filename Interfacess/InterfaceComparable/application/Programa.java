package Interfacess.InterfaceComparable.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Interfacess.InterfaceComparable.entities.Funcionarios;

public class Programa {
    public static void main(String[] args) {
        List<Funcionarios> list = new ArrayList<>();
        String path = "C:\\Users\\caiod\\OneDrive\\Área de Trabalho\\Java\\Interfacess\\InterfaceComparable\\application\\caio.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String funcionarios = br.readLine();
            while (funcionarios != null) {
                String[] fields  = funcionarios.split(",");
                list.add(new Funcionarios(fields[0], Double.parseDouble(fields[1])));
                funcionarios = br.readLine();
            }
            Collections.sort(list);
            for (Funcionarios emp : list) {
                System.out.println(emp.getNome() + ", " + emp.getSalario());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
