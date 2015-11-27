package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ZoeLiu on 10/5/15.
 */
public class subset2 {

    public List<String> subSets(String set) {
        // write your solution here
        if (set == null)
            return null;
        List<String> result = new ArrayList<String>();
        result.add("");
        char[] array = set.toCharArray();
        Arrays.sort(array);
        dfsHelper(array, 0, result, new StringBuilder());
        return result;
    }
    private void dfsHelper(char[] array, int start, List<String> result, StringBuilder str){
        result.add(str.toString());
        for (int i = start; i < array.length; i++){
            if (i > start && array[i] == array[i - 1]) continue;
            str.append(array[i]);
            dfsHelper(array, start + 1, result,str);
            str.deleteCharAt(str.length() - 1);
        }
    }
}
