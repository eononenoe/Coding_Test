import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		int list[] = new int[t];
		
		for(int i=0;i<t;i++){
			list[i] = sc.nextInt();
		}
		int v = sc.nextInt();
		int cnt = 0;
		for(int j=0;j<t;j++){
			if(list[j]==v){
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
