import java.io.*;

import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int[] abc = new int[26];
            String s = br.readLine();
            s = s.toLowerCase();
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c >= 'a' && c <= 'z') {
                    abc[c - 'a']++;
                }
            }
            int max = Arrays.stream(abc).max().getAsInt();
            int count = 0;
            int idx = -1;

            for (int k = 0; k < 26; k++) {
                if (abc[k] == max) {
                    count++;
                    idx = k;
                }
            }

            char result;
            if (count > 1)
                result = '?';
            else
                result = (char) (idx + 'a');
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }
}
