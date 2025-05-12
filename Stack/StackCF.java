import java.util.*;

public class StackCF {
    public static void pushAtBottum(int data, Stack<Integer> s) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottum(data, s);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> List = new Stack<>();
        List.push(1);
        List.push(2);
        List.push(3);
        pushAtBottum(4, List);
        while (!List.isEmpty()) {
            System.out.println(List.peek());
            List.pop();
        }

    }
}
