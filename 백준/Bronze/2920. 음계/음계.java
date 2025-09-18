import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] list = new int[8];
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] b = { 8, 7, 6, 5, 4, 3, 2, 1 };

        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
        }

        boolean isAsc = true;
        boolean isDesc = true;

        for (int i = 0; i < list.length; i++) {
            if (list[i] != a[i]) {
                isAsc = false;
            }
            if (list[i] != b[i]) {
                isDesc = false;
            }
        }
        if (isAsc) {
            System.out.println("ascending");
        } else if (isDesc) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}