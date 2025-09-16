import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        char[] ca = s.toCharArray();
        
        for(int i=0;i<s.length()/2;i++){
            char temp = ch[i];
            ch[i] = ch[ch.length - 1 - i];
            ch[ch.length -1 -i] = temp;
        }
        if(Arrays.equals(ch, ca)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
