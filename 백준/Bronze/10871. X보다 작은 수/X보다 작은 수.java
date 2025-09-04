import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();
		int list[] = new int[n];

		for (int i = 0; i < n; i++) {
			list[i] = sc.nextInt();
			if (list[i] < x) {
				System.out.print(list[i] + " ");
			}
		}
	}
}
