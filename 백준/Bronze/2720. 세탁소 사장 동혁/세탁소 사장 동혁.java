
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int price = sc.nextInt();

            int q = price /25;
            price %= 25;

            int d = price / 10;
            price %= 10;

            int n = price / 5;
            price %= 5;

            int p = price;
            System.out.println(q + " " + d + " " + n + " " + p);
        }
    }
}