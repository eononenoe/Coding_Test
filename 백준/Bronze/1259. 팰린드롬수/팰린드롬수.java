
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String s = sc.nextLine();
            String reversed = new StringBuilder(s).reverse().toString();
            int n = Integer.parseInt(s);
            if (n == 0) {
                break;
            }
            if (s.equals(reversed)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        }
    }
}
