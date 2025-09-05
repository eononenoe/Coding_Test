import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 10;
		int cnt = 0;
		
		boolean[] check = new boolean[42];
		
		for(int i=0;i<n;i++){
			int num = sc.nextInt();
			check[num % 42] = true;
		}
		for(int i=0;i<42;i++){
			if(check[i]){
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
