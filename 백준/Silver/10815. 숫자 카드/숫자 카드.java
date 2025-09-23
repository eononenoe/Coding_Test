import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }
        int m = sc.nextInt();
        for(int i=0; i<m;i++){
            int num = sc.nextInt();
            if(set.contains(num)){
                System.out.print(1+" ");
            }else{
                System.out.print(0+" ");
            }
        }

    }
}