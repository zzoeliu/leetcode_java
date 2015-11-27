package recursive;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZoeLiu on 9/24/15.
 */
public class NQueens {
    public List<List<Integer>> nqueens(int n) {
        // write your solution here
        if (n == 0)
            return new ArrayList<List<Integer>>();
        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();

        dfsHelper(n, 0, new ArrayList<Integer>(), result);
        return result;
    }
    private void dfsHelper(int n, int row, ArrayList<Integer> list, ArrayList<List<Integer>> result){
        if (row == n){
            result.add(new ArrayList<Integer>(list));
            return;
        }
        for (int i = 0; i < n; i++){
            if (isValid(list, row, i)){
                int len = list.size();
                list.add(i);
                dfsHelper(n, row + 1, list,result);
                list.remove(list.size() - 1);
            }
        }
    }
    private boolean isValid(ArrayList<Integer> list, int row, int index){
        for (int i = 0; i < row; i++){
            int temp = list.get(i);
            if ( index == temp || (row - i) == Math.abs(index - temp)){
                return false;
            }
        }
        return true;
    }
}
