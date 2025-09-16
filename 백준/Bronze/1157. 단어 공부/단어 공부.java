import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        s = s.toUpperCase();

        int[] list = new int[26];
        int max = 0;
        int idx = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            list[c - 'A']++;
        }
        for (int i = 0; i < 26; i++) {
            if (list[i] > max) {
                max = list[i];
                idx = i;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (list[i] == max) {
                count++;
            }
        }
        if (count > 1) {
            System.out.println("?");
        } else {
            System.out.println((char) (idx + 'A'));
        }
    }
}
