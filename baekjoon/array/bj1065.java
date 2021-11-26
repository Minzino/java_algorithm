package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj1065 {

	public static int arithmetic_sequence(int num) {
		int cnt = 0;
		if (num < 100) {
			return num;
		} else {
			cnt = 99;
			if (num == 1000) {
				num = 999;
			}
			for (int i = 100; i <= num; i++) {
				int hundred = i / 100;
				int ten = (i / 10) % 10;
				int one = i % 10;

				if ((hundred - ten) == (ten - one)) {
					cnt++;
				}
			}
		}
		return cnt;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(arithmetic_sequence(Integer.parseInt(br.readLine())));

	}

}
