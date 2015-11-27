package string;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZoeLiu on 9/15/15.
 */
public class CoinCombination {
    public List<List<Integer>> combinations(int target, int[] coins) {
        // write your solution here
        //the recursion tree has coins.length levels ,each level we have remaining/coins[i]
        //branches. on each level , we need to try each branch and recursive to next levels
        assert(target >= 0 && coins != null && coins.length != 0);

        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();

        dfsHelper(target, coins, 0, result, new ArrayList<Integer>());
        return result;
    }
    private void dfsHelper(int target, int[] coin, int level, ArrayList<List<Integer>> result, ArrayList<Integer> list){
        if (level == coin.length - 1){
            if(target%coin[coin.length - 1]== 0) {
                list.add(target/coin[coin.length - 1]);
                result.add(new ArrayList<Integer>(list));
                list.remove(list.size() -1 );
            }
            return;
        }
        int n = target/coin[level];
        for(int i = 0; i <= n; i++){
            list.add(i);
            dfsHelper(target - i*coin[level], coin, level + 1, result, list);
            list.remove(list.size() - 1);
        }
    }
}
