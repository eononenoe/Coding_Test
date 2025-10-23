import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();

        long r = 31;
        long r_pow = 1;
        long mod = 1234567891;

        long h = 0;
        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            int n = c - 'a' + 1;

            h += n * r_pow;
            h %= mod;

            r_pow = (r_pow * r) % mod;
        }
        System.out.println(h);
    }
}
