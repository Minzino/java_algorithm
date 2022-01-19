package twoSum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> index = new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            int num = target - nums[i];
            if (index.containsKey(num)) {
                return new int[]{index.get(num), i};
            }
            index.put(nums[i], i);
        }
        return new int[]{};
    }
}