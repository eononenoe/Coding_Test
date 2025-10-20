import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] size = new int[6];

        for(int i=0;i<size.length;i++){
            size[i] = sc.nextInt();
        }

        int t = sc.nextInt();
        int p = sc.nextInt();

        int T1 = 0;
        for(int i=0;i<size.length;i++){
            T1 += (size[i]+t-1)/t;
        }
        int P1 = n/p;
        int P2 = n%p;
        
        System.out.println(T1);
        System.out.println(P1+" "+P2);
    }
}
