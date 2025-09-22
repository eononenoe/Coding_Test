import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int grade = 0;
        int count = 0;
        for(int i=1;;i++){
            count += i;
            if(count>=n){
                grade = i;
                break;
            }
        }
        int idx = n - (count - grade);
        int mom = 0;
        int child = 0;
        if(grade % 2 == 0) {
            mom = idx;
            child = grade - idx + 1;
        }else{
            mom = grade - idx + 1;
            child = idx;
        }
         System.out.println(mom + "/" + child);
    }
}