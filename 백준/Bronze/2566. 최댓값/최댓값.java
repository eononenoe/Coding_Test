import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max_value = -1;
        int max_row = 0;
        int max_col = 0;

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                int num = sc.nextInt();
                if(num>max_value){
                    max_value = num;
                    max_row = i;
                    max_col = j;
                }
            }
        }
        System.out.println(max_value);
        System.out.println((max_row+1)+" "+(max_col+1));
    }
}
