import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int b = sc.nextInt();

        String result = Integer.toString(n,b).toUpperCase();
        System.out.println(result);
    }
}