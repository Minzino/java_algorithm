package String;

//import java.util.Scanner;
//
//public class bj10809 {
//
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//
//		int[] arr = new int[26];
//
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = -1;
//		}
//
//		String S = in.nextLine();
//
//		for (int i = 0; i < S.length(); i++) {
//			char ch = S.charAt(i);
//
//			if (arr[ch - 'a'] == -1) { // arr 원소 값이 -1 인 경우에만 초기화
//				arr[ch - 'a'] = i;
//			}
//		}
//
//		for (int val : arr) { // 배열 출력
//			System.out.print(val + " ");
//		}
//	}
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj10809 {
	public static void main(String[] args) throws IOException {
		// input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();
		for (char a = 'a'; a <= 'z'; a++) {
			sb.append(s.indexOf(a)).append(" ");
		}
		System.out.println(sb.toString());
	}
}
