import java.util.*;
public class StackCF {
    public static void main(String[] args) {
       Stack<Integer> List = new Stack<>(); 
         List.push(1);
        List.push(2);
        List.push(3);
        List.push(4);
        List.push(05);
        List.push(06);
        List.push(07);
        while (!List.isEmpty()) {
            System.out.println(List.peek());
            List.pop();
        }

    }
    }
