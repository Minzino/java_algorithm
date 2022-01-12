package io_and_arithmetic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class bj1076 {
    public static void main(String[] args) throws IOException {
        Map<String, String> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        map.put("black", "0,1");
        map.put("brown", "1,10");
        map.put("red", "2,100");
        map.put("orange", "3,1000");
        map.put("yellow", "4,10000");
        map.put("green", "5,100000");
        map.put("blue", "6,1000000");
        map.put("violet", "7,10000000");
        map.put("grey", "8,100000000");
        map.put("white", "9,1000000000");

        String firstColor = br.readLine();
        String secondColor = br.readLine();
        String thirdColor = br.readLine();

        String resistanceValue = map.get(firstColor).split(",")[0]+map.get(secondColor).split(",")[0];

        long result = Long.parseLong(resistanceValue)*Long.parseLong(map.get(thirdColor).split(",")[1]);

        System.out.print(result);

    }
}

