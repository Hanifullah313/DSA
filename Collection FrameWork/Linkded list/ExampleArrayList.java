import java.util.*;

public class ExampleArrayList {
    public static void main(String[] args) {
    ArrayList<Integer>  list = new ArrayList<>();  
    // Add Elements 
    list.add(0); 
    list.add(34); 
    list.add(90); 
    list.add(39);
    System.out.println(list);
    // get elements 
    int ele = list.get(3);
    System.out.println(ele);
    //add elements
    list.add(4,453);
    System.out.println(list);
    //set elements
    list.set(0,453);
    System.out.println(list);
    //Delete elements
    list.remove(3);
    System.out.println(list);
    //Sizze
    System.out.println(list.size());
    //sorting
    Collections.sort(list);
    System.out.println(list);


} 
}
