import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Deque<int[]> dq = new ArrayDeque<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String[] num = br.readLine().split(" ");

        List<int[]> balloons = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int move = Integer.parseInt(num[i]);
            balloons.add(new int[] { i + 1, move });
        }
        for(int[] b : balloons){
            dq.addLast(b);
        }
        List<Integer> result = new ArrayList<>();
        while(!dq.isEmpty()){
            int[] cur = dq.pollFirst();
            int idx = cur[0];
            int move = cur[1];

            result.add(idx);

            if(dq.isEmpty()){
                break;
            }
            if(move>0){
                for(int i=0;i<move-1;i++){
                    dq.addLast(dq.pollFirst());
                }
            }else{
                for(int i=0;i<Math.abs(move);i++){
                    dq.addFirst(dq.pollLast());
                }
            }
        }
        for(int x : result){
            sb.append(x).append(" ");
        }
        System.out.print(sb);

    }
}
