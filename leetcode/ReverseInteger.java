import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseInteger {
    public static void main(String[] args) throws IOException {
        //int형 변수가 입력되면 반전해서 출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int number = Integer.parseInt(br.readLine());
        int temp = 0;

        if (number < 0) {
            temp = number;
            number = Math.abs(number);
        }
        for (int i = 0; i < (int) (Math.log10(number) + 1); i++) {
            if (number % 10 != 0) {
                sb.append(number % 10);
            }
            number /= 10;
            if (number < 10) {
                sb.append(number);
            }
        }
        if(temp < 0) {
            System.out.println(Integer.parseInt(String.valueOf(sb))*(-1));
        }else {
            System.out.println(Integer.valueOf(String.valueOf(sb)));
        }
    }

}
//class Solution {
//    public int reverse(int x) {
//        StringBuilder sb = new StringBuilder();
//        int result = 0;
//        int temp = 0;
//        if (x < 0) {
//            temp = x;
//            x = Math.abs(x);
//        }
//        for(int i = 0 ; i<(int)(Math.log10(x)+1);i++){
//            if(x%10 != 0){
//                sb.append(x%10);
//            }
//            x /= 10;
//            if(x < 10){
//                sb.append(x);
//            }
//        }
//        if(temp < 0){
//            result = -1 * Integer.valueOf(String.valueOf(sb));
//        }else{
//            result = Integer.valueOf(String.valueOf(sb));
//        }
//        return result;
//    }
//}


//다른 사람 답안
//class Solution {
//    public int reverse(int x) {
//        long reverseResult = 0;
//
//        while (x != 0) {
//            reverseResult *= 10;
//            reverseResult += x % 10;
//            x /= 10;
//        }
//
//        if (-Integer.MAX_VALUE <= reverseResult && reverseResult <= Integer.MAX_VALUE) {
//            return (int) reverseResult;
//        } else {
//            return 0;
//        }
//    }
//}