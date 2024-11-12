import java.util.*;

public class TreeHash {
    public static void main(String srgs[]) {
        // Instantiate two collections -- a HashMap and a TreeMap -- with
        // String as both the key type and the object type.
        HashMap<String, String> h = new HashMap<String, String>();
        TreeMap<String, String> t = new TreeMap<String, String>();

        // Insert several Strings into the HashMap, where the String serves
        // as both the key and the value.
        h.put("FISH", "FISH");
        h.put("DOG", "DOG");
        h.put("CAT", "CAT");
        h.put("ZEBRA", "ZEBRA");
        h.put("RAT", "RAT");

        // Insert the same Strings, in the same order, into the TreeMap.
        t.put("FISH", "FISH");
        t.put("DOG", "DOG");
        t.put("CAT", "CAT");
        t.put("ZEBRA", "ZEBRA");
        t.put("RAT", "RAT");

        // Iterate through the HashMap to retrieve all Strings ...
        System.out.println("Retrieving from the HashMap:");

        for (String s : h.values()) {
            System.out.println(s);
        }

        System.out.println();

        // ... and then through the TreeMap.
        System.out.println("Retrieving from the TreeMap: sorted it by key");

        for (String n : t.values()){
            System.out.println(n);
        }        
    }
}