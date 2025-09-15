import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String[] input = sc.nextLine().trim().split("\\s+");
		char[] arr1 = input[0].toCharArray();
		char[] arr2 = input[1].toCharArray();

		for(int i=0,j = arr1.length-1;i<j;i++,j--){
			char temp = arr1[i];
			arr1[i] = arr1[j];
			arr1[j] = temp;
		}
		for(int i=0,j = arr2.length-1;i<j;i++,j--){
			char temp = arr2[i];
			arr2[i] = arr2[j];
			arr2[j] = temp;
		}
		int x = Integer.parseInt(new String(arr1));
		int y = Integer.parseInt(new String(arr2));
		if(x>y){
			System.out.println(x);
		}else{
			System.out.println(y);
		}
		
	}
}