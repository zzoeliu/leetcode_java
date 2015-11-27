package string;

/**
 * Created by ZoeLiu on 8/27/15.
 */
public class WildCard {
        public boolean isMatch(String s, String p) {

            if((s == null && p == null) || p.equals("?*")) return true;
            int count = 0;
            for (int i = 0; i < p.length(); i++) {
                if (p.charAt(i) != '*') count++;
            }
            if (count > s.length()) return false;
            boolean[][] dp = new boolean[s.length()+1][p.length()+1];
            dp[0][0] = true;
            for(int i = 1; i <= p.length(); i++){
                if(p.charAt(i-1) == '*') dp[0][i] = dp[0][i-1];
            }
            for(int i = 1; i <= s.length(); i++){
                for(int j = 1; j <= p.length(); j++){
                    if(s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1)=='?')
                    {
                        dp[i][j] = dp[i-1][j-1];
                    }else if(p.charAt(j-1) == '*')
                    {
                        for(int k = 0; k <= i; k++)
                        {
                            if(dp[k][j-1] == true)
                                dp[i][j] = true;
                            break;
                        }
                    }
                }
            }
            return dp[s.length()][p.length()];
        }
}
