package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class bj3052 {
	public static void main(String[] args) throws IOException {

//		boolean[] arr = new boolean[42];
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//		for (int i = 0; i < 10; i++) {
//			arr[Integer.parseInt(br.readLine()) % 42] = true;
//		}
//
//		int count = 0;
//		for (boolean value : arr) {
//			if (value) {
//				count++;
//			}
//		}
//		System.out.println(count);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> hs = new HashSet<Integer>();

		for (int i = 0; i < 10; i++) {
			hs.add(Integer.parseInt(br.readLine()) % 42);
		}
		System.out.println(hs.size());

	}

}
