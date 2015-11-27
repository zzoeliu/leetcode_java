package string;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZoeLiu on 9/15/15.
 */
public class AllParenthesis {
    public List<String> validParentheses(int n) {
        // write your solution here
        //recursively add left/right parenthese
        //case 1 : left == n, and right == n , add result
        //case 2 : left < n, recursively call to add (
        //case 3 : right < left,recursively call to add )
        //totally 2n levels, on each level we need to take actions according to left and right parameters, right should not bigger than left
        List<String> result = new ArrayList<String>();
        if (n == 0){
            result.add("");
            return result;
        }
        dfsHelper(n, 0, 0, result, new StringBuilder());
        return result;
    }
    private void dfsHelper(int n, int left, int right, List<String> result, StringBuilder str){
        if (left == n && right == n){
            result.add(str.toString());
            return;
        }
        if (left < n){
            str.append('(');
            dfsHelper(n, left + 1, right, result, str);
            str.deleteCharAt(str.length() - 1);
        }
        if (right < left){
            str.append(')');
            dfsHelper(n, left, right + 1, result, str);
            str.deleteCharAt(str.length() - 1);
        }
    }
}
