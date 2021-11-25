package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj2562 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] str = new int[9];
		for (int i = 0; i < 9; i++) {
			str[i] = Integer.parseInt(br.readLine());
		}
		int max = 0;
		int index = 0;

		for (int i = 0; i < 9; i++) {
			if (str[i] > max) {
				max = str[i];
				index = (i + 1);
			}
		}
		System.out.println(max+"\n"+index);

	}

}
