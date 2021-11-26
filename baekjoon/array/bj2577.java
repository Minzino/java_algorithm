package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj2577 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int result = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine())
				* Integer.parseInt(br.readLine());
		String place = Integer.toString(result);
		int[] count = new int[10];

		for (int i = 0; i < ((int) (Math.log10(result) + 1)); i++) {
			if (place.charAt(i) - 48 == 0) {
				count[place.charAt(i) - 48] += 1;
			} else if (place.charAt(i) - 48 == 1) {
				count[place.charAt(i) - 48] += 1;
			} else if (place.charAt(i) - 48 == 2) {
				count[place.charAt(i) - 48] += 1;
			} else if (place.charAt(i) - 48 == 3) {
				count[place.charAt(i) - 48] += 1;
			} else if (place.charAt(i) - 48 == 4) {
				count[place.charAt(i) - 48] += 1;
			} else if (place.charAt(i) - 48 == 5) {
				count[place.charAt(i) - 48] += 1;
			} else if (place.charAt(i) - 48 == 6) {
				count[place.charAt(i) - 48] += 1;
			} else if (place.charAt(i) - 48 == 7) {
				count[place.charAt(i) - 48] += 1;
			} else if (place.charAt(i) - 48 == 8) {
				count[place.charAt(i) - 48] += 1;
			} else if (place.charAt(i) - 48 == 9) {
				count[place.charAt(i) - 48] += 1;
			}
		}
		for (int i = 0; i < count.length; i++) {
			System.out.println(count[i]);
		}

	}

}
