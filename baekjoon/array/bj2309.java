package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class bj2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        int sum = 0;
        int[] arrDwarf = new int[9];
        int[] fakeDwarf = new int[2];

        for (int i = 0; i < 9; i++) {
            arrDwarf[i] = Integer.parseInt(br.readLine());
            sum+=arrDwarf[i];
        }
        Arrays.sort(arrDwarf);



        int temp1 = 0;
        for(int i = 0 ; i <9; i++){
            if(temp1 == 100) break;
            temp1 = sum;
            temp1-=arrDwarf[i];
            int temp2 = temp1;
            for(int j = i + 1;j < 9;j++){
                temp1-=arrDwarf[j];
                if(temp1==100){
                    fakeDwarf[0] = arrDwarf[i];
                    fakeDwarf[1] = arrDwarf[j];
                    break;
                }
                temp1 = temp2;
            }
        }
        for(int i = 0 ; i<9; i++){
            if(arrDwarf[i] != fakeDwarf[0] && arrDwarf[i] != fakeDwarf[1] ) {
                sb.append(arrDwarf[i]).append("\n");
            }
        }
        System.out.println(sb);
    }
}
//다른 풀이
//package array;
//
//        import java.io.BufferedReader;
//        import java.io.IOException;
//        import java.io.InputStreamReader;
//        import java.util.Arrays;
//
//public class bj2309 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//
//
//        int sum = 0;
//        int[] arrDwarf = new int[9];
//
//        for (int i = 0; i < 9; i++) {
//            arrDwarf[i] = Integer.parseInt(br.readLine());
//            sum += arrDwarf[i];
//        }
//        Arrays.sort(arrDwarf);
//
//
//        boolean flag = false;
//        for (int i = 0; i < 9; i++) {
//            for (int j = i; j < 9; j++) {
//                if (arrDwarf[i] + arrDwarf[j] == sum - 100) {
//                    arrDwarf[i] = arrDwarf[j] = 0;
//                    flag = true;
//                    break;
//                }
//            }
//            if (flag) break;
//        }
//
//        for (int i = 0; i < 9; i++) {
//            if (arrDwarf[i] != 0) {
//                sb.append(arrDwarf[i]).append("\n");
//            }
//        }
//        System.out.println(sb);
//    }
//}
