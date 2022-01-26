package io_and_arithmetic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj2752 {

    //    public static String toString(int[] arr) {
//        return arr[0] + " " + arr[1] + " " + arr[2];
//    }
//
//    public static void main(String[] args) throws IOException {
//        int[] arr = new int[3];
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        for (int i = 0; i < 3; i++) {
//            arr[i] = Integer.parseInt(st.nextToken());
//        }
//        Arrays.sort(arr);
//
//        System.out.println(bj2752.toString(arr));
//    }

//    private static int temp = 0;
//
//    public static int[] sortNumber(int first,int second,int third){
//        if (first > second) {
//            temp = first;
//            first = second;
//            second = temp;
//            if (first > third) {
//                temp = first;
//                first = third;
//                third = temp;
//                if (second > third) {
//                    temp = second;
//                    second = third;
//                    third = temp;
//                }
//            }
//        }
//        if (first > third) {
//            temp = first;
//            first = third;
//            third = temp;
//            if (second > third) {
//                temp = second;
//                second = third;
//                third = temp;
//            }
//        }
//        if (second > third) {
//            temp = second;
//            second = third;
//            third = temp;
//        }
//        return new int[]{first,second,third};
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//
//        int first = Integer.parseInt(st.nextToken());
//        int second = Integer.parseInt(st.nextToken());
//        int third = Integer.parseInt(st.nextToken());
//        int result[] = sortNumber(first,second,third);
//
//        System.out.println(result[0] + " " + result[1] + " " + result[2]);
//    }



        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();

            String str = br.readLine();
            String[] strArr = str.split(" ");
            int[] arr = new int[strArr.length];

            for(int i = 0; i<3 ; i++){
                arr[i] = Integer.parseInt(strArr[i]);
            }

            Arrays.sort(arr);



            System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);

    }
}
