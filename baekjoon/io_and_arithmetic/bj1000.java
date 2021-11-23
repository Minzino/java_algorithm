package io_and_arithmetic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj1000 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(),",");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken()); 
        System.out.print(a+b);
        
    }
}
