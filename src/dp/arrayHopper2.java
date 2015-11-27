package dp;

/**
 * Created by ZoeLiu on 10/1/15.
 */
public class arrayHopper2 {
    public int minJump(int[] array) {
        // write your solution here
        //Similar with array hopper II
        assert(array != null && array.length != 0);
        int n = array.length;
        int[] dp = new int[n];
        for (int i = n - 1; i >= 0; i--){
            if (i + array[i] > n - 1){
                dp[i] = 1;
            }else{
                int min = Integer.MAX_VALUE;
                for (int j = 1; j <= array[i] && (i + j) < n; j++){
                    min = Math.min(min, dp[i + j]);
                }
                if (min == Integer.MAX_VALUE){
                    dp[i] = min;
                }else{
                    dp[i] = min + 1;
                }
            }
        }
        return dp[0] == Integer.MAX_VALUE ? -1 : dp[0];
    }
}
