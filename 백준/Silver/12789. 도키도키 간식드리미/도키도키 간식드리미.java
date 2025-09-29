import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        
        int n = sc.nextInt();
        int[] line = new int[n];
        int expected = 1;

        for (int i = 0; i < n; i++) {
            line[i] = sc.nextInt();
        }

        for(int x : line){
            if(x==expected){
                expected++;
            }else{
                stack.push(x);
            }
            while(!stack.empty()&& stack.peek()==expected){
                stack.pop();
                expected++;
            }
        }
         if (expected == n + 1) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }
}
