package array;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by ZoeLiu on 11/17/15.
 */
public class max1s {
    public int largest(int[][] matrix) {
        // write your solution here
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return 0;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        int[] dp = new int[col];
        int global_max = 0;
        for(int i = 0; i < row; i++){
            Deque<Integer> stack = new LinkedList<Integer>();
            int localMax = 0;
            for(int j = 0; j < col; j++){
                if(i == 0){
                    dp[j] = matrix[i][j] == 1 ? 1 : 0;
                }else{
                    dp[j] = matrix[i][j] == 1 ? dp[j] + 1: 0;
                }
            }
            int index = 0;
            while(index <= col){
                if(stack.isEmpty() || (index == col ? 0 : dp[index]) >= dp[stack.peekLast()]){
                    stack.offerLast(index++);
                }else{
                    int cur = stack.pollLast();
                    localMax = Math.max(localMax, dp[cur] * (stack.isEmpty() ? index : index - stack.peekLast() - 1));
                        /*if(stack.isEmpty()){
                            localMax = Math.max(localMax,dp[cur] *index);
                        }else{
                            localMax = Math.max(localMax,dp[cur] * (index - stack.peekLast() - 1));
                        }*/
                }
            }
            global_max = Math.max(global_max,localMax);
        }
        return global_max;
    }
}
