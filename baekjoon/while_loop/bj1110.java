package while_loop;

import java.io.IOException;
import java.util.Scanner;

public class bj1110 {
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	//입력
		int copy = N;		//변수 복사
		int count = 0;
		sc.close(); 
		do {
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			count++;
		} while(copy != N);
		System.out.println(count);
	}
}
