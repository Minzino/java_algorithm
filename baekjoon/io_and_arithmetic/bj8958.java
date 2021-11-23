package io_and_arithmetic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj8958 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(br.readLine()); //테스트 케이스입력
		String score[] = new String[test_case];

		for (int i = 0; i < test_case; i++) {
			int sum = 0;
			int count = 0;
			score[i] = br.readLine();
			for(int j = 0; j < score[i].length(); j++) {

				if(score[i].charAt(j) == 'O') {
					count++;
					sum += count;
				}else if(score[i].charAt(j) == 'X') {
					count = 0;
				}
			}
			System.out.println(sum);
		}
	}

}