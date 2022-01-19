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

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int a = 0; a < commands.length; a++) {
            int i, j, k;
            i = commands[a][0];
            j = commands[a][1];
            k = commands[a][2];
            int[] temp = Arrays.copyOfRange(array, i - 1, j);
            Arrays.sort(temp);
            answer[a] = temp[k - 1];
        }
        return answer;
    }
}