import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int list[] = new int[n];
		for(int i=0;i<n;i++){
			list[i]= i+1;
		}
		
		for(int x=0;x<m;x++){
			int i = sc.nextInt();
			int j = sc.nextInt();
			
			int temp = list[i-1];
			list[i-1] = list[j -1];
			list[j-1] = temp;
		}
		for(int i=0;i<n;i++){
			 System.out.print(list[i] + " ");
		}
	}
}
