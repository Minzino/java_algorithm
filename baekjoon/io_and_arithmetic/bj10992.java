package io_and_arithmetic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj10992 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            for (int j = i; j < testCase - 1; j++) {
                sb.append(" ");
            }
            for (int j = 0; j < (i * 2 + 1); j++) {
                if (i != 0 && i != (testCase-1)) {
                    if (j == 0 || j == i * 2) {
                        sb.append("*");
                    }
                    else{
                        sb.append(" ");
                    }
                }else{
                    sb.append("*");
                }
            }
            sb.append("\n");

        }
        System.out.print(sb);
    }
}
