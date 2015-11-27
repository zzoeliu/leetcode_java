package string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by ZoeLiu on 9/21/15.
 */
public class LongestNodup {
    public int lengthOfLongestSubstring(String s) {
        //We need a hashmap to record key and latest location pair
        //we also need an index to record the start index from which to our current i index, no duplicate exist
        //Step 1: corner case
        /*if (s == null || s.length() == 0){
            return 0;
        }
        if (s.length() == 1){
            return 1;
        }
        char[] array = s.toCharArray();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int start = 0;
        int maxLength = 0;
        for (int i = 0; i < array.length; i++){
            if (!map.containsKey(array[i])){
                if (i == array.length - 1){
                    maxLength = Math.max(maxLength, i - start + 1);
                }
                map.put(array[i],i);
            }else {
                if (i == array.length - 1 && map.get(array[i]) < start){
                    maxLength = Math.max(maxLength, i - start + 1);
                } else if (map.get(array[i]) >= start || i == array.length - 1){
                    maxLength = Math.max(maxLength, i - start);
                    //map.put(array[i],i);
                    start = map.get(array[i]) + 1;
                }
                    map.put(array[i],i);

            }
        }
        return maxLength;*/
        if (s == null || s.length() == 0){
            return 0;
        }
        int left = 0, right = 0;
        char[] array = s.toCharArray();
        Set<Character> map = new HashSet<Character>();
        int maxLength = 0;
        while(right < array.length){
            if (map.contains(array[right])){
                map.remove(array[left]);
                left++;
            }else {
                map.add(array[right]);
                right++;
                maxLength = Math.max(maxLength, right - left);
            }
        }
        return maxLength;
    }
}
