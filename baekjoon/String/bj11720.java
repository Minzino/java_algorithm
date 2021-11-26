package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj11720 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		String str_number = br.readLine();
		int sum = 0;
		for (int i = 0; i < number; i++) {
			sum += str_number.charAt(i) - '0';
		}
		System.out.println(sum);
	}

}
