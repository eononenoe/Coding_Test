import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = sc.nextInt();
		int j = 1;
		while(j<=9){
			int x = i*j;
			System.out.printf("%d * %d = %d\n",i,j,x);
			j++;
		}
	}
}
