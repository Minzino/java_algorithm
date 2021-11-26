package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj4344 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int[] students;
		int test_case = Integer.parseInt(br.readLine());
		for (int i = 0; i < test_case; i++) {
			int sum = 0;
			int count = 0;
			st = new StringTokenizer(br.readLine(), " ");
			int student = Integer.parseInt(st.nextToken());
			students = new int[student];
			for (int j = 0; j < student; j++) {
				students[j] = Integer.parseInt(st.nextToken());
				sum += students[j];
			}
			float average = sum / student;
			for (int k = 0; k < student; k++) {
				if (average < students[k]) {
					count++;
				}
			}
			float high_average = (float) count / (float) student * 100;
			sb.append(String.format("%.3f", high_average)).append("%").append("\n");
		} // StringBuilder에서 소수점 자리수 맞추는 방법 String.format(%.자리수f",변수)
		System.out.println(sb);

	}

}
