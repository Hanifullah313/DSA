import java.util.*;
public class LinkListCl {
  public static void main(String[] args) {
    LinkedList <String> list = new LinkedList();
    list.add("a");
    list.add("ab");
    list.add("abc");
    list.add("abcd");
    list.add("abcde");
    System.out.println(list);
    System.out.println(list.size());
    list.remove(2);
    System.out.println(list);
  }  
}
