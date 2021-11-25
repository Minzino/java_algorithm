package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj10818 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), "\n");
		int[] str = new int[number];
		for (int i = 0; i < number; i++) {
			str[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(str);
		System.out.println(str[0]+ " "+ str[number - 1]);
	}

}
