

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Queue<Integer> qu = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        int k = sc.nextInt();

        for(int i=0;i<n;i++){
            qu.add(i+1);
        }
        sb.append("<");

        while(!qu.isEmpty()){
            for(int i=0;i<k-1;i++){
                qu.offer(qu.poll());
            }
            int re = qu.poll();
            sb.append(re);
        if(!qu.isEmpty()){
            sb.append(", ");
        }
        }

        sb.append(">");
        System.out.println(sb);
    }
}
