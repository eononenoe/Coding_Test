import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		int time = 0;
		for (char c : s.toCharArray()) {
			int num = c - 'A';
			if (num <= 2) {
				time += 3;
			} else if (num <= 5) {
				time += 4;
			} else if (num <= 8) {
				time += 5;
			} else if (num <= 11) {
				time += 6;
			} else if (num <= 14) {
				time += 7;
			} else if (num <= 18) {
				time += 8;
			} else if (num <= 21) {
				time += 9;
			} else {
				time += 10;
			}
		}
		System.out.println(time);
	}
}