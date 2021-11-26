package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj1546 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int quantity = Integer.parseInt(br.readLine()); // 수량 Quantity

		float[] scores = new float[quantity];
		float max = 0;
		float average = 0; // 평균

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < quantity; i++) {
			scores[i] = Integer.parseInt(st.nextToken());
			if (scores[i] > max) {
				max = scores[i];
			}
		}
		for (int i = 0; i < quantity; i++) {
			average += (scores[i]) / max * 100;
		}
		System.out.println(average / quantity);

	}

}
