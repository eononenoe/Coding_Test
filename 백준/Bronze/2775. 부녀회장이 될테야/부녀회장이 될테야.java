
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();

            int[][] people = new int[k + 1][n + 1];

            for (int j = 1; j <= n; j++) {
                people[0][j] = j;
            }

            for (int floor = 1; floor <= k; floor++) {
                for (int room = 1; room <= n; room++) {
                    if (room == 1)
                        people[floor][room] = 1;
                    else
                        people[floor][room] = people[floor][room - 1] + people[floor - 1][room];
                }
            }

            System.out.println(people[k][n]);
        }
    }
}
