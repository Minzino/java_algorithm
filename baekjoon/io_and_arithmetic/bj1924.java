package io_and_arithmetic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj1924 {
    public static void main(String[] args) throws IOException {
        int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        br.close();

        int months = Integer.parseInt(st.nextToken());
        int days = Integer.parseInt(st.nextToken());
        int sum = 0;

        for (int i = 0; i < months - 1; i++) {
            sum += maxDays[i];
        }
        sum += days;

        int weekday = sum % 7;

        String strday="";

        switch (weekday) {
            case 0:
                strday = "SUN";
                break;
            case 1:
                strday = "MON";
                break;
            case 2:
                strday = "TUE";
                break;
            case 3:
                strday = "WED";
                break;
            case 4:
                strday = "THU";
                break;
            case 5:
                strday = "FRI";
                break;
            case 6:
                strday = "SAT";
                break;
        }

        System.out.print(strday);
    }
}
