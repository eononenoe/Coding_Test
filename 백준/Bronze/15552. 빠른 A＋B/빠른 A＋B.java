import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	

		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			String[] part = br.readLine().split(" ");
			int a = Integer.parseInt(part[0]);
			int b = Integer.parseInt(part[1]);
			bw.write((a+b)+"\n");
		}
		bw.flush();
		bw.close();
	}
}
