import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int i=1;i<=t;i++){
			for(int j=t;j>i;j--){
				System.out.print(" ");
			}
			for(int x=1;x<=i;x++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
