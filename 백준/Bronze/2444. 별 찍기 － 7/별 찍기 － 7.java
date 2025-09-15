
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();
        for(int i=0;i<(n*2-1);i++){
            int space = Math.abs(n- 1 - i);
            int stars = (2*n -1) - 2*space;
            for(int j=0; j<space;j++){
                System.out.print(" ");
            }
            for(int j=0; j<stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
