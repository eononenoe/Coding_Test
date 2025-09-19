import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] s = new String[5];
        for (int i = 0; i < s.length; i++) {
            s[i] = sc.nextLine();
        }
        int max = 0;
        for (String str : s) {
            if (str.length() > max) {
                max = str.length();
            }
        }
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < s.length; j++) {
                if (i < s[j].length()) {
                    System.out.print(s[j].charAt(i));
                }
            }
        }
    }
}