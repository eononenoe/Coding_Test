import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int list[] = new int[5];
        int sum = 0;

        for(int i=0;i<list.length;i++){
            list[i]= sc.nextInt();
            list[i] = list[i]*list[i];
            sum += list[i];
        }
        System.out.println(sum % 10);
    }
}
