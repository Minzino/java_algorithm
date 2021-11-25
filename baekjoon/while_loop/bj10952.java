package while_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj10952 {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st= new StringTokenizer(br.readLine()," ");
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());
			if((first+second) == 0) {
				break;
			}
			sb.append((first+second)+"\n");			
		}
		System.out.println(sb);
	}
}
