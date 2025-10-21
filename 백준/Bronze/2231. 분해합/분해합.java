import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();       
        int x = n - 9 * String.valueOf(n).length();             

        for (int m = x; m < n; m++) { 
            int sum = 0;               
            String s = String.valueOf(m);  

            for (int i = 0; i < s.length(); i++) {
                sum += s.charAt(i) - '0';   
            }

            if (m + sum == n) {       
                System.out.println(m); 
                return;                
            }
        }

        System.out.println(0); 
    }
}
