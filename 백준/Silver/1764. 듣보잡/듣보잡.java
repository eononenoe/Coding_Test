import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        int n = sc.nextInt();
        int m = sc.nextInt();

        sc.nextLine();
        for (int i = 0; i < n; i++) {
            set1.add(sc.nextLine());
        }
        for (int i = 0; i < m; i++) {
            set2.add(sc.nextLine());
        }
   
        //교집합 : retainAll
        set1.retainAll(set2);

        //정렬 위해 리스트로 변환
        List<String> result = new ArrayList<>(set1);
        Collections.sort(result);

        System.out.println(result.size());
        for(String name : result){
            System.out.println(name);
        }
    }
}