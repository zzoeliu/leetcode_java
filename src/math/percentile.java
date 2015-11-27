package math;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ZoeLiu on 9/27/15.
 */
public class percentile {
    public int percentile95(List<Integer> lengths) {
        // write your solution here
        assert(lengths != null && lengths.size() != 0);
        int[] array = new int[4097];
        Arrays.fill(array,0);
        for (int i = 0; i < lengths.size(); i++){
            int len = lengths.get(i);
            array[len]++;
        }
        int target = (int)Math.ceil((double)lengths.size() * 0.95);
        int total = 0;
        int i = 0;
        while (i < array.length && total < target){
            total += array[i++];
        }
        return i;
    }
}
