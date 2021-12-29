package io_and_arithmetic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj2440 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());
        br.close();

        for (int i = testCase; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
