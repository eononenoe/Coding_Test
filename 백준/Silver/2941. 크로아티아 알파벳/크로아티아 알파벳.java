
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        s = s.replace("c=", "*");
        s = s.replace("c-", "*");
        s = s.replace("dz=", "*");
        s = s.replace("d-", "*");
        s = s.replace("lj", "*");
        s = s.replace("nj", "*");
        s = s.replace("s=", "*");
        s = s.replace("z=", "*");

        int count = 0;
        for(int i=0;i<s.length();i++){
            count++;
        }
        System.out.println(count);
    }
}
