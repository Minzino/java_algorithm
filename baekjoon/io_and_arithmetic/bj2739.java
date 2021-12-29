package io_and_arithmetic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 1; i < 10; i++) {
            sb.append(testCase).append(" * ").append(i).append(" = ").append(testCase * i).append("\n");
        }
        System.out.print(sb);
    }
}
