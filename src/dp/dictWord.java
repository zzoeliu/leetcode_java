package dp;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ZoeLiu on 10/1/15.
 */
public class dictWord {
    public boolean canBreak(String input, String[] dict) {
        // write your solution here
        assert(input != null && dict != null && dict.length != 0);
        Set<String> hashset = new HashSet<String>();
        for (int i = 0; i < dict.length; i++){
            hashset.add(dict[i]);
        }
        //Use dp array, dp[i] means where the substring 0..i could be composed by dict words
        int len = input.length();
        boolean[] dp = new boolean[len + 1];
        dp[0] = false;//base case
        for (int i = 1; i <= len; i++){
            if(hashset.contains(input.substring(0,i))){
                dp[i] = true;
                continue;
            }
            for (int j = 1; j < i ; j++){
                dp[i] = dp[i] || (dp[j] && hashset.contains(input.substring(j,i)));
                if(dp[i]){
                    break;
                }
            }
        }
        return dp[len];
    }
}
