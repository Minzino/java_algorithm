package io_and_arithmetic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;
        str = br.readLine();
        br.close();

        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if ((i+1) % 10 == 0) {
                sb.append("\n");
            }
        }

        System.out.println(sb);
    }
}
