package io_and_arithmetic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj2442 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 1; i < testCase + 1; i++) {
            for (int j = i; j < testCase; j++) {
                sb.append(" ");
            }
            for (int j = 0; j < (i * 2 - 1); j++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}
