
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String s = sc.nextLine();
            Stack<Character> stack = new Stack<>();
            boolean vps = true;

            for (int j = 0; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (ch == '(') {
                    stack.push(ch);
                } else {
                    if (stack.empty()) {
                        vps = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }

            if(vps&&stack.empty()){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
