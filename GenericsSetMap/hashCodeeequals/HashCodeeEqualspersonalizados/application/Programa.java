package GenericsSetMap.hashCodeeequals.HashCodeeEqualspersonalizados.application;

import GenericsSetMap.hashCodeeequals.HashCodeeEqualspersonalizados.entities.Cliente;

public class Programa {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Caio", "caio@gmail.com");
        Cliente c2 = new Cliente("Alex", "alex@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
    }
}
