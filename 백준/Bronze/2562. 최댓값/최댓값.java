import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 9;
		int list[] = new int[n];
		int cnt = 0;
		int max = 0;
		for(int i=0;i<n;i++){
			list[i] = sc.nextInt();
			if(list[i]>max){
				max = list[i];
				cnt = i + 1;
			}
		}
		System.out.println(max);
		System.out.println(cnt);
	}
}
