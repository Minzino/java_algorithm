package io_and_arithmetic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;
        int testCase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCase; i++) {
            str = br.readLine();
            sb.append("Case #").append(i+1).append(": ").append((str.charAt(0)-'0') + (str.charAt(2)-'0')).append("\n");
        }
        System.out.print(sb);

    }
}
