package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ZoeLiu on 10/21/15.
 */
public class sortedSpecific {
    public int[] sortSpecial(int[] A1, int[] A2) {
        // Write your solution here.
        assert(A1 != null && A2 != null);
        Map<Integer,Integer> hashmap = new HashMap<Integer, Integer>();
        for (int i = 0 ; i < A2.length; i++){
            hashmap.put(A2[i], 0);
        }
        Arrays.sort(A1);
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < A1.length; i++){
            Integer count = hashmap.get(A1[i]);
            if (count != null){
                hashmap.put(A1[i], ++count);
                list.add(i);
            }
        }
        int listIndex = 0;
        for(int i = 0; i < A2.length; i++){
            Integer count = hashmap.get(A2[i]);
            while(count != 0){
                int index = list.get(listIndex++);
                A1[index] = A2[i];
                count--;
            }
        }
        return A1;
    }
}
