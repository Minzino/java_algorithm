package for_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj11021 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int number = Integer.parseInt(br.readLine());
		int first = 0;
		int second = 0;
		for (int i = 0; i < number; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			first = Integer.parseInt(st.nextToken());
			second = Integer.parseInt(st.nextToken());
			sb.append("Case #"+(i+1)+": "+(first+second)+"\n");
		}
		System.out.println(sb);

	}

}

