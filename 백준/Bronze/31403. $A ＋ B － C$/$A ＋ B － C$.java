
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();
        int c = sc.nextInt();
        System.out.println(Integer.parseInt(a)+Integer.parseInt(b)-c);
        System.out.println(Integer.parseInt(a+b)-c);
    }
}
