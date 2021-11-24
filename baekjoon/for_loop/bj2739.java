package for_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj2739 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int times = Integer.parseInt(br.readLine());
		for (int i = 1; i < 10; i++) {
			sb.append(times + " * " + i + " = " + times * i+"\n");
		}
		System.out.println(sb);

	}

}
