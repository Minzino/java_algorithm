package io_and_arithmetic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj2588 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int first = Integer.parseInt(br.readLine());
		String[] second = br.readLine().split("");
		int[] result = new int[second.length];
		int j = second.length;

		for (int i = 0; i < second.length; i++) {
			result[i] = first * Integer.parseInt(second[j-1]);
			j--;
		}
		System.out.println(result[0]);
		System.out.println(result[1]);
		System.out.println(result[2]);
		System.out.println(result[0] + (result[1] * 10) + (result[2] * 100));
	}

}
