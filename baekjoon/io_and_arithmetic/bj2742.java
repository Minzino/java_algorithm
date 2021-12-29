package io_and_arithmetic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj2742 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int str =Integer.parseInt(br.readLine());
        br.close();

        for(int i = str ; i>0 ; i--){
            if(i==1){
                sb.append(i);
                break;
            }
            sb.append(i).append("\n");
        }
        System.out.print(sb);
    }
}
