package for_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj10871 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st1.nextToken());
		int X = Integer.parseInt(st1.nextToken());
		
		int[] sequence = new int[N];
		for (int i = 0; i < N; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
			sequence[i] = Integer.parseInt(st2.nextToken());
		}
		for(int i =0; i< N ; i++) {
			if(sequence[i]<X) {
				sb.append(sequence[i]+" ");
			}
		}
		System.out.println(sb);

	}

}
