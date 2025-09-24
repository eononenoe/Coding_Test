
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> toname = new HashMap<>();
        Map<String,Integer> tonum = new HashMap<>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        int no = 1;
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            toname.put(no, s);
            tonum.put(s, no);
            no++;
        }
        for(int i=0;i<m;i++){
            String q = sc.nextLine();
            if(Character.isDigit(q.charAt(0))){
                int num = Integer.parseInt(q);
                System.out.println(toname.get(num));
            }else{
                System.out.println(tonum.get(q));
            }
        }

    }
}