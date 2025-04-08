import java.util.*;


public class StrinBuilder {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("hanif");
        System.out.println(name);
        //charAtr
        System.out.println(name.charAt(0));
        // set charAt at index
        name.setCharAt(3, 'g');
        System.out.println(name);
        // Insert charAt at index
        name.insert(0, 'g');
        System.out.println(name); 
        // Delete charAt at index
        name.delete(0, 3);
        System.out.println(name); 
        // Apend charAt at index
        name.append("hello");
        System.out.println(name); 
 
    }
}
