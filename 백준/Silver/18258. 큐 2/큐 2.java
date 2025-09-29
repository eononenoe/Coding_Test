import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Queue<Integer> qu = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());
        int last = 0;

        for (int i = 0; i < n; i++) {
            String cmd = br.readLine();

            if (cmd.startsWith("push")) {
                String[] parts = cmd.split(" ");
                int value = Integer.parseInt(parts[1]);
                qu.add(value);
                last = value;
            } else if (cmd.equals("pop")) {
                if (qu.isEmpty()) {
                    sb.append("-1").append("\n");
                } else {
                    sb.append(qu.poll()).append("\n");
                }
            } else if (cmd.equals("size")) {
                sb.append(qu.size()).append("\n");
            } else if (cmd.equals("empty")) {
                if (qu.isEmpty()) {
                    sb.append("1").append("\n");
                } else {
                    sb.append("0").append("\n");
                }
            } else if (cmd.equals("front")) {
                if (qu.isEmpty()) {
                    sb.append("-1").append("\n");
                } else {
                    sb.append(qu.peek()).append("\n");
                }
            } else if (cmd.equals("back")) {
                if (qu.isEmpty()) {
                    sb.append("-1").append("\n");
                } else {
                    sb.append(last).append("\n");
                }
            }
        }
        System.out.print(sb.toString());
    }
}
