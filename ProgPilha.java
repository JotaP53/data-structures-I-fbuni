import java.util.Stack;

public class ProgPilha {
    public static void main(String[] args) {
        Stack p1 = new Stack();
        for(int i = 1; i <= 10; i++) {
            p1.push(123);
        }
        while (!p1.empty()) {
            System.out.println(p1.top());
            p1.pop();
        }
    }
}