import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b = sc.next();
		int b0 = Integer.parseInt(b);
		int b1 = Integer.parseInt(b.substring(2,3));
		int b2 = Integer.parseInt(b.substring(1,2));
		int b3 = Integer.parseInt(b.substring(0,1));
		
		System.out.println(a*b1);
		System.out.println(a*b2);
		System.out.println(a*b3);
		System.out.println(a*b0);
	}
}
