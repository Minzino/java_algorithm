package while_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj10951 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String str;
		while ((str = br.readLine()) != null) {
			/**
			 * readLine() 을 통해 입력을 하여 
			 * str 에 저장된 데이터가 null 일 경우 
			 * while 반복문을 종료시켜버리고 아닐경우 반복문을 계속 수행하도록 한다.
			 */
			st = new StringTokenizer(str, " ");
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());
			sb.append((first + second) + "\n");
		}
		System.out.println(sb);
	}
}
