package string;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZoeLiu on 9/15/15.
 */
public class AllPermutations {
        public List<String> permutations(String set) {
            // write your solution here
            //Use recursive tree to illustrate this process
            //for index layer, we start from indexth item to exchange with the following items.
            //note, we need to exchange from index instead of index + 1 to avoid skipping the first item
            //step 1: corner case, deal with null string or string with length 0
            if (set == null){
                return new ArrayList<String>();
            }
            List<String> result = new ArrayList<String>();
            if (set.length() == 0){
                result.add("");
                return result;
            }
            char[] array = set.toCharArray();

            //step 2: recursively solve this problem
            dfsHelper(array, 0, result);
            return result;
        }
    private void dfsHelper(char[] set, int index, List<String> result){
        //finish all layers exhchange, we need to record the result;
        if (index == set.length){
            result.add(new String(set));
            return;
        }
        //exchange each item with the indexth elements to get new permutations
        for (int i = index; i< set.length; i++){
            swap(set, index, i);
            dfsHelper(set, index + 1, result);
            swap(set, index, i);// we need to restore the string to avoid duplicates, cause we did exchange in place
        }
    }
    private void swap(char[] array, int i, int j){
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
