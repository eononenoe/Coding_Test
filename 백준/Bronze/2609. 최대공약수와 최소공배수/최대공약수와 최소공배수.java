import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().trim().split("\\s+");

        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);

        int A = a; 
        int B = b;

        while (B != 0) {
            int r = A % B;
            A = B;
            B = r;
        }
        int gcd = A;
        int lcm = (a * b) / gcd; 

        System.out.println(gcd);
        System.out.println(lcm);
    }
}
