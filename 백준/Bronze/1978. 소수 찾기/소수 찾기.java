import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x > 1) {
                boolean r = true;
                for (int j = 2; j <= Math.sqrt(x); j++) {
                    if (x % j == 0) {
                        r = false;
                        break;
                    }
                }
                if (r)
                    cnt++;
            }
        }
        System.out.println(cnt);
    }
}
