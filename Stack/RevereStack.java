import java.util.Stack;

public class RevereStack {

    public static void pushAtBottum(int data, Stack<Integer> s) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottum(data, s);
        s.push(top);
    }

    public static void reverse(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverse(s);
        pushAtBottum(top, s);
    }

    public static void main(String[] args) {
        Stack<Integer> List = new Stack<>();
        List.push(1);
        List.push(2);
        List.push(3);
        reverse(List);
        while (!List.isEmpty()) {
            System.out.println(List.peek());
            List.pop();
        }

    }
}
