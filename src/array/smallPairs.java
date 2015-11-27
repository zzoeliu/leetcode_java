package array;

import java.util.Arrays;

/**
 * Created by ZoeLiu on 11/18/15.
 */
public class smallPairs {
    public int smallerPairs(int[] array, int target) {
        // write your solution here
        assert(array != null && array.length >= 2);
        Arrays.sort(array);
        int start = 0, end = array.length - 1;
        int result = 0;
        while(start < end){
            int sum = array[start] + array[end];
            if(sum >= target){
                end--;
            }else{
                break;
            }
        }
        for(int i = start; i <= end - 1; i++){
            for(int j = start + 1; j <= end; j++){
                int sum = array[i] + array[j];
                if(sum < target){
                    result++;
                }
            }
        }
        return result;
    }
}
