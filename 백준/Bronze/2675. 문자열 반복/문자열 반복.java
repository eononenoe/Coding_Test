import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = Integer.parseInt(sc.nextLine());

		for(int i=0;i<t;i++){
			String[] input = sc.nextLine().split(" ");
			int r = Integer.parseInt(input[0]);
			String s = input[1];
			for(int j=0;j<s.length();j++){
				char ch = s.charAt(j);
				for(int k=0;k<r;k++){
					System.out.print(ch);
				}
			}
			System.out.println();
		}
	}
}