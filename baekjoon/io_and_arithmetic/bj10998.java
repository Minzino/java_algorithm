package io_and_arithmetic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.
 * @author alswp
 *
 */

public class bj10998 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] number = br.readLine().split(" ");
		int result = Integer.parseInt(number[0])*Integer.parseInt(number[1]);
		System.out.println(result);

	}

}
