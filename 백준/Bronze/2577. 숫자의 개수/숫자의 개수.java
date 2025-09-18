import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] counts = new int[10];
        int result = a * b * c;
        String s = String.valueOf(result);

        for (int i = 0; i < s.length(); i++) {
            int d = s.charAt(i) - '0';
            counts[d]++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(counts[i]);
        }
    }
}
