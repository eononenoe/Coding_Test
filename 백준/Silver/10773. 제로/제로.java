import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int cmd = sc.nextInt();
            if (cmd != 0) {
                stack.push(cmd);
            } else {
                stack.pop();
            }
        }
        int sum = 0;
        for (int num : stack) {
            sum += num;
        }
        System.out.println(sum);
    }
}
