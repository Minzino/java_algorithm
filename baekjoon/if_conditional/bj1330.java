package if_conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj1330 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] number = br.readLine().split(" ");
		int A = Integer.parseInt(number[0]);
		int B = Integer.parseInt(number[1]);
		if(A>B) {
			System.out.println(">");			
		}
		if(A<B) {
			System.out.println("<");
		}
		if(A==B) {
			System.out.println("==");
		}
	}

}
