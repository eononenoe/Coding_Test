
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int cmd = sc.nextInt();
            if (cmd == 1) {
                stack.push(sc.nextInt());
            } else if (cmd == 2) {
                if (stack.empty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(stack.pop()).append("\n");
                }
            } else if (cmd == 3) {
                sb.append(stack.size()).append("\n");
            } else if (cmd == 4) {
                sb.append(stack.empty() ? 1 : 0).append("\n");
            } else if (cmd == 5) {
                if (stack.empty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(stack.peek()).append("\n");
                }
            }
        }

        System.out.print(sb);
    }
}
