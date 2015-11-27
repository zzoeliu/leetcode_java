package dp;

/**
 * Created by ZoeLiu on 9/29/15.
 */
public class ArrayHopper {
    public boolean canJump(int[] array) {
        // write your solution here
        // Design : Use 1D dynamic programming
        //dp[i] means that if  array[i] could reach the end of array
        if(array == null || array.length <= 1)
            return true;
        int n = array.length;
        boolean[] dp = new boolean[n];
        dp[n - 1] = false;
        for (int i = n - 2; i >= 0; i--){
            dp[i] = false;
            for(int j = 1; j <= array[i]; j++){
                if (i + j >= n - 1 || dp[i + j]){
                    dp[i] = true;
                }
            }
        }
        return dp[0];
    }
}
