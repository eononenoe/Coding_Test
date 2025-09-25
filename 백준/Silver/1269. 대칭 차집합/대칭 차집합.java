import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < a; i++) {
            set1.add(sc.nextInt());
        }
        for (int i = 0; i < b; i++) {
            set2.add(sc.nextInt());
        }
        // 그대로 복사하기
        Set<Integer> diffA = new HashSet<>(set1);
        Set<Integer> diffB = new HashSet<>(set2);

        // 차집합 : removeAll
        set1.removeAll(diffB);
        set2.removeAll(diffA);

        System.out.println(set1.size()+set2.size());
    }
}