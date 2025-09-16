
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int result = 0;

        for (int i = 0; i < t; i++) {
            String s = sc.next();
            boolean[] list = new boolean[26];
            boolean group = true;
            char prev = 0;

            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);

                if (c != prev) {
                    if (list[c - 'a']) { 
                        group = false;
                        break;
                    }
                    list[c - 'a'] = true; 
                }
                prev = c; 
            }
            if (group)
                result++;
        }
        System.out.println(result);
    }
}
