package Kakao;

import java.util.Arrays;
import java.util.Stack;

public class puppetDraw {
    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        Solution test = new Solution();
        System.out.println(test.solution(board, moves));
    }
}
