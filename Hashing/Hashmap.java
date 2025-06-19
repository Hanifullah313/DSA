package Hashing;
import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        // country (key) , Population (value)
        HashMap<String, Integer> map = new HashMap<>();
        // insertion
        map.put("India", 120);
        map.put("China", 150);
        map.put("Pakistan", 20);
        map.put("KSA", 100);
        // will Update the Value
        map.put("KSA", 1090);
        map.put("USA", 180);
        System.out.println(map);

        // search
        if (map.containsKey("China")) {
            System.out.println(" key is present in the map");

        } else {
            System.out.println(" key is not present in the map");
        }
        // get value of Key
        System.out.println(map.get("China")); // we show the value
        System.out.println(map.get("Azarbaijan"));// not exist in the map return "Null"
        // Iteration
        for ( Map.Entry < String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        // Another Method 
        Set <String > keys = map.keySet();
        for(String Key : keys){
            System.out.println(Key +" "+map.get(Key));
        }
        

        // Remove
        map.remove("China");
        System.out.println(map);
    }
}
