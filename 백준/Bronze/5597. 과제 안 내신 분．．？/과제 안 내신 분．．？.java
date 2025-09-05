import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean[] submit = new boolean[31];
		
		for(int i=0;i<28;i++){
			int n = sc.nextInt();
			submit[n] = true;
		}
		for(int i=1;i<=30;i++){
			if(!submit[i]){
				System.out.println(i);
			}
		}
	}
}
