import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int nFac = 1;
        for (int i = 1; i <= n; i++) {
            nFac *= i;
        }

        int kFac = 1;
        for (int i = 1; i <= k; i++) {
            kFac *= i;
        }

        int nkFac = 1;
        for (int i = 1; i <= n - k; i++) {
            nkFac *= i;
        }

        int result = nFac / (kFac * nkFac);
        System.out.println(result);
    }
}
