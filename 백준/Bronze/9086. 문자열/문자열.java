import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t= sc.nextInt();
		sc.nextLine();
		for(int i=0;i<t;i++){
			String S = sc.nextLine();
			char first = S.charAt(0);
			char end = S.charAt(S.length()-1);
			System.out.println(""+first+end);
		}
	}
}