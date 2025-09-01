import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		for(int a=1;a<=x;a++){
			int i = sc.nextInt();
			int j = sc.nextInt();
			System.out.println(i+j);
		}
	}
}