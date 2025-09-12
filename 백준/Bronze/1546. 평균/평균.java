import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int list[] = new int[n];
		for (int i = 0; i < n; i++) {
			list[i] = sc.nextInt();
		}
		int max = list[0];
		for (int i = 1; i < n; i++) {
			max = Math.max(max, list[i]);
		}
		double sum = 0;
		for (int i = 0; i < n; i++) {
			sum += (double) list[i] / max * 100;
		}
		System.out.print(sum / n );
	}
}
