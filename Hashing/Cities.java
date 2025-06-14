package Hashing;

import java.util.*;

public class Cities {

    // Function to find the starting city
    public static String getStart(HashMap<String, String> tick) {
        // Step 1: Create a set of all destination cities
        HashSet<String> destinations = new HashSet<>(tick.values());

        // Step 2: Find the source city that is not in destination set
        for (String source : tick.keySet()) {
            if (!destinations.contains(source)) {
                return source; // This is the start of the journey
            }
        }

        return null; // If no start city is found
    }

    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);
        System.out.println("Start City: " + start);

        // Optional: Print the full path
        System.out.println("Full Route:");
        while (start != null && tickets.containsKey(start)) {
            String next = tickets.get(start);
            System.out.println(start + " -> " + next);
            start = next;
        }
    }
}
