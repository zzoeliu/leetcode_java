package array;

import java.util.List;

/**
 * Created by ZoeLiu on 9/16/15.
 */
public class MaxPair {
    public int[] maxPair(int[] array){
        assert(array != null && array.length > 1);
        //int[] result = new int[array.length - 1];
        int max = Integer.MIN_VALUE;
        int[] r = new int[2];
        for (int i = 0; i < array.length - 1; i++){
            int sum = array[i] + array[i + 1];
            if(sum > max){
                max = sum;
                r[0] = array[i];
                r[1] = array[i + 1];
            }
        }
        return r;
    }
}
