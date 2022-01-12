package for_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj1009 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        StringTokenizer st;
//        int testCase = Integer.parseInt(br.readLine());
//        for (int i = 0; i < testCase; i++) {
//            st = new StringTokenizer(br.readLine(), " ");
//            int base = Integer.parseInt(st.nextToken());
//            int exponent = Integer.parseInt(st.nextToken());
//            int pow = 1;
//            for (int j = 0; j < exponent; j++) {
//                pow *= base;
//                if (pow >= 10) {
//                    pow %= 10;
//                }
//                if(pow == 0){
//                    pow = 10;
//                    break;
//                }
//            }
//            sb.append(pow).append("\n");
//        }
//        br.close();
//        System.out.println(sb);
//    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int[][] repeatedNumbers = {{10}, {1}, {2, 4, 8, 6}, {3, 9, 7, 1}, {4, 6}, {5}, {6}, {7, 9, 3, 1}, {8, 4, 2, 6}, {9, 1}};

        int testCase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCase; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int base = Integer.parseInt(st.nextToken());
            int exponent = Integer.parseInt(st.nextToken());
            sb.append(repeatedNumbers[(base) % 10][(exponent - 1) % repeatedNumbers[base % 10].length]).append("\n");
        }
        System.out.println(sb);
    }

}
