package sort;

import java.util.Arrays;

public class kthNumber {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        Solution test = new Solution();
        System.out.println(Arrays.toString(test.solution(array, commands)));
    }

}

