package GenericsSetMap.Map.application;

import java.util.Map;
import java.util.TreeMap;

public class Programa {
    public static void main(String[] args) {
        Map<String, String> cookies = new TreeMap<>(); 

        cookies.put("usuario", "Caio");
        cookies.put("email", "caio@gmail.com");
        cookies.put("plone", "9928429053");

        cookies.remove("email");
        cookies.put("plone", "984279053");

        System.out.println("Contains 'plone' key: " + cookies.containsKey("plone"));
        System.out.println("Plone number: " + cookies.get("plone"));
        System.out.println("Email: " + cookies.get("email"));
        System.out.println("Size: " + cookies.size());

        System.out.println("All Cookies: ");
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
