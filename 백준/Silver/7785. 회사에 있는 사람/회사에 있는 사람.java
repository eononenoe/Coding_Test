
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> set = new HashSet<>();
        int n = sc.nextInt();

        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String[] s = sc.nextLine().trim().split("\\s+");
            if (s[1].equals("enter")) {
                set.add(s[0]);
            }else if(s[1].equals("leave")){
                set.remove(s[0]);
            }
        }

        List<String> list = new ArrayList<>(set);
        Collections.sort(list,Collections.reverseOrder());

        for(String name :list){
            System.out.println(name);
        }
    }
}