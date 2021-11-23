package io_and_arithmetic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj2588 {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int first = Integer.parseInt(br.readLine());
		String[] second = br.readLine().split("");
		int[] result = {first*Integer.parseInt(second[2]),first*Integer.parseInt(second[1]),first*Integer.parseInt(second[0])};
		System.out.println(result[0]);
		System.out.println(result[1]);
		System.out.println(result[2]);
		System.out.println(result[0]+(result[1]*10)+(result[2]*100));
	}

}
