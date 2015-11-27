package dp;

/**
 * Created by ZoeLiu on 9/28/15.
 */
public class cutRope {
    public int maxProduct(int n) {
        //Step 1: deal with base case
        if(n <= 1)
            return -1;
//Step 2: define a 1D array M to store the intermediate result
//M[i] means the largest product we get by cutting i meters rope
        int[] dp = new int[n + 1];
        dp[1] = 0;// cause we should do at least one cut
        for(int i = 2; i < n + 1; i++){
            int maxProduct = 0;
            for(int j = 1; j < i;j++){
                maxProduct = Math.max(maxProduct,Math.max(j,dp[j]) * Math.max(i - j,dp[i - j]));
            }
            dp[i] = maxProduct;
        }
        return dp[n];
    }
}
