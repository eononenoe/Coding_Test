import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();

            int floor = (n - 1) % h + 1;
            int room = (n - 1) / h + 1;
            int result = floor * 100 + room;
            System.out.println(result);
        }
    }
}
