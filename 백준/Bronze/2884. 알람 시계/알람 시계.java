import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();

		if(b<45){
			a -= 1;
			b = 60 - 45 + b;
			if(a<0){
				a = 24 - 1;
				System.out.println(a+" "+b);
			}else{
				System.out.println(a+" "+b);
			}
		}else{
			b -= 45;
			System.out.println(a+" "+b);
		}
	}
}
