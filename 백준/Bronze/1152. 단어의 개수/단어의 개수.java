import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String[] input = sc.nextLine().trim().split("\\s+");
		System.out.println(input[0].isEmpty()?0:input.length);
	}
}