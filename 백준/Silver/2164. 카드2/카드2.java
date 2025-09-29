import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> qu = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());

        for(int i=1;i<=n;i++){
            qu.add(i);
        }
        while(qu.size()>1){
            qu.poll();
            qu.add(qu.poll());
        }
        System.out.println(qu.peek());;
    }
}
