package io_and_arithmetic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String st = br.readLine();

        String[] str = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (String s : str) {
            if (st.contains(s)) {
                st = st.replace(s, "o");
            }
        }
        System.out.println(st.length());

    }
}
