package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class bj2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int first = Integer.parseInt(new StringBuilder().append(st.nextToken()).reverse().toString());
		int second = Integer.parseInt(new StringBuilder().append(st.nextToken()).reverse().toString());
		/*
		 * 변수마다 StringBuilder 객체를 생성해준이유는 
		 * 하나의 객체를 사용하면 Stringbuilder 객체에
		 * 모든 입력이 저장되기때문에 구분을 지어줬다.
		 * 그리고 reverse()를 하고나서 
		 * 다시 문자열로 변환을 시켜줘야하기 때문에
		 *  toString()을 사용해줘야한다.
		 */
		System.out.println(first > second ? first : second);
	}
}