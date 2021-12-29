package io_and_arithmetic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj10991 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 1; i <= testCase; i++) {
            for (int j = 0; j < testCase - i; j++) {
                sb.append(" ");
            }
            for (int j = 0; j <= (i * 2 - 1); j++) {
                if (j % 2 == 0) {
                    sb.append("*");
                } else {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
