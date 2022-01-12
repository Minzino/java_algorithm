package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj1052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); //주어진 물병의 개수
        int K = Integer.parseInt(st.nextToken()); //들고다닐수 있는 물병 개수
        int buyBottle = 0; // 구매한 물병 개수

        while (true) {
            int tempN = N + buyBottle;
            int cnt = 0; //들고가는 물병 개수

            while (tempN > 0) {
                if (tempN % 2 != 0) {
                    cnt++;
                }
                tempN /= 2;
            }
            if (cnt <= K) {
                break;
            } //들고가는 물병의 수가 들고다닐 수 있는 물병의 수보다 작으면 반환
            buyBottle++;
        }
        System.out.println(buyBottle);
    }
}


// 다른사람들의 풀이를 보다가 좋은 메소드를 발견해서 주석을 써봤다.
// Integer.bitCount(); 메소드는 정수 값을 이진수로 읽어서 1의 개수를 카운팅해주는 메소드이다.
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class bj1052 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        int N = Integer.parseInt(st.nextToken()); //주어진 물병의 개수
//        int K = Integer.parseInt(st.nextToken()); //들고다닐 수 있는 물병 개수
//
//            // 결과 값
//        int buyBottle = 0;
//
//            // n개의 물병으로 만들 수 있는 물병 개수 countBottle
//        int countBottle = Integer.bitCount(N); //현재 주어진 물병을 최대로 합친 개수
//        while(countBottle > K){
//            countBottle = Integer.bitCount(++N);
//            buyBottle ++;
//        }
//        System.out.println(buyBottle);
//    }
//}
