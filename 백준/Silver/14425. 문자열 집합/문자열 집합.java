import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> set = new HashSet<>();
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;

        sc.nextLine();

        for(int i=0;i<n;i++){
            set.add(sc.nextLine());
        }
        for(int i=0;i<m;i++){
            String s = sc.nextLine();
            if(set.contains(s)){
               count++;
            }
        }
        System.out.println(count);
    }
}