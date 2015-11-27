package string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by ZoeLiu on 9/20/15.
 */
public class AllPermutationsII {
    public List<String> allPermutations(String str){
        // Step 1: deal with corner case
        if (str == null || str.length() == 0)
            return new ArrayList<String>();
        //Step 2: call dfsHelper to generate all permutations
        List<String> result = new ArrayList<String>();
        dfsHelper(str, 0, result);
        return result;
    }
    private void dfsHelper(String str, int index, List<String> result){
//Step 1 : if we have all letters, we need to add it to the result list
        if (index == str.length()){
            result.add(str);
            return;
        }
//Step 2 : exchange the current letter with the following letters seperately to get different permutations
        Set<Character> hashset = new HashSet<Character>();//note the string contains //dupicate letters
        for (int i = index; i < str.length(); i++){
            if(!hashset.contains(str.charAt(i))){
                hashset.add(str.charAt(i));
                swap(str, index, i);
                dfsHelper(str, index + 1, result);
                swap(str, index, i);//restore
            }
        }
    }
    private void swap(String str, int i, int j){
        char[] array = str.toCharArray();
        char temp = array[j];
        array[j] = array[i];
        array[i] = temp;
        str = new String(array);
    }

}
