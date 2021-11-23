package io_and_arithmetic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj2438 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine()); //숫자입력
		br.close();		
		StringBuilder sb = new StringBuilder();		
		for(int i = 0; i < number; i++) {
			for(int j = 0; j <= i; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}		
		System.out.println(sb); //출력부분
	}

}