import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 중복 제거하려고 Set 사용
        Set<String>set = new HashSet<>();

        String s = sc.nextLine();

        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                // 부분 문자열 뽑기
                set.add(s.substring(i, j));
            }
        }
        System.out.println(set.size());
    }
}