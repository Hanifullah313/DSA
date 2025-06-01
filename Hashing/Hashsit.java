import java.util.*;

public class Hashsit {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        /// insert
        set.add(1);
        set.add(12);
        set.add(13);
        set.add(14);
        set.add(15);
        // search >>> Contains
        if (set.contains(12)) {
            System.out.println(" 12 is found");
        }
        if (!set.contains(90)) {
            System.out.println(" 90 is not found");
        }
        // Delete
        set.remove(1);
        if (!set.contains(1)) {
            System.out.println(" Deleted Successfully ");
        }
        // size
        System.out.println(set.size());
        // print all elements
        System.out.println(set);
        // iterator
        Iterator it = set.iterator();
        // hasnext
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
