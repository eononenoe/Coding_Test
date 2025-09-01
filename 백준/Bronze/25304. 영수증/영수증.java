
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int total = sc.nextInt();
		int type = sc.nextInt();
		int sum = 0;

		for (int i = 0; i < type; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			sum += a * b;
		}
		if(sum==total){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
