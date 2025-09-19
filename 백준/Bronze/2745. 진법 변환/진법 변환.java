import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int b = sc.nextInt();

        int result = Integer.parseInt(s,b);
        System.out.println(result);
    }
}