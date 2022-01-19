package twoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class TwoSum {
    public static void main(String[] args) {
        Solution sl = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(sl.twoSum(nums, target)));
    }
}


//d
//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> index = new HashMap<>();
//        int[] result = new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            int num1 = i;
//            int num2 = target - i;
//            if (IntStream.of(nums).anyMatch(x -> x == num1)) {
//                result[0] = Arrays.asList(nums).indexOf(num1);
//                result[1] = Arrays.asList(nums).indexOf(num2);
//            }
//        }
//        return result;
//    }
//}