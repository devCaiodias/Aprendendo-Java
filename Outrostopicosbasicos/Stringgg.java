package Outrostopicosbasicos;

public class Stringgg {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG   ";

        String s01 = original.trim();
        String s02 = original.substring(2);
        String s03 = original.substring(2, 9);
        String s04 = original.replace('a', 'x');
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");
        
        System.out.println("Original: -" + original + "-");
        System.out.println("trim: -" + s01 + "-");
        System.out.println("substring(2): -" + s02 + "-");
        System.out.println("substring(2, 9): -" + s03 + "-");
        System.out.println("replece('a', 'x'): -" + s04 + "-");
        System.out.println("Index of 'bc': " + i);
        System.out.println("lastIndex of 'bc': " + j);


    }
}
