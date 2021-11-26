package method;

public class bj4673 {

	public static int d(int number) {

		int sum = number;

		while (number != 0) { // 입력된 수가 0이 되었을때 break;
			sum += number % 10; // 입력된 수의 첫번째 자리수
			number = number / 10; // 입력된 수의 첫번째 자리수를 없앤다.
		}
		return sum; //생성자를 전부 리턴
	}

	public static void main(String[] args) {
		boolean[] check = new boolean[10001]; // 1부터 시작이라 10001까지로 정함

		for (int i = 1; i < 10001; i++) {
			int n = d(i);

			if (n < 10001) {
				check[n] = true; //생성자를 전부 true로 저장
			}
		}
		StringBuilder sb = new StringBuilder();

		for (int i = 1; i < 10001; i++) {
			if (!check[i]) { //false 인 index만 출력 false는 생성자가 아니기때문에
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb);
	}

}
