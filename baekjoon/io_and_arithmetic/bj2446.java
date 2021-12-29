package io_and_arithmetic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj2446 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            for (int j = 0; j < i; j++) {
                sb.append(" ");
            }
            for (int j = i * 2; j < (testCase * 2 - 1); j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        for (int i = 1; i < testCase; i++) {
            for (int j = i; j < testCase - 1; j++) {
                sb.append(" ");
            }
            for (int j = i; j <= i * 3; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
