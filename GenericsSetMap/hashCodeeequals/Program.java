package GenericsSetMap.hashCodeeequals;

public class Program {
    public static void main(String[] args) {

        // Equals
        String a = "Maria";
        String b = "Maria";
        System.out.println(a.equals(b));

        // HashCode
        String d = "Maria";
        String c = "Alex";
        System.out.println(d.hashCode());
        System.out.println(c.hashCode());
    }
}
