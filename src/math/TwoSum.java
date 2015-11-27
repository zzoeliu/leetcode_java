package math;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by ZoeLiu on 7/30/15.
 */
public class TwoSum {
    public boolean existSum(int[] array,int target)
    {
        if((array == null && target == 0) || (array.length == 0 && target == 0)) return true;
        if(array.length == 1) return array[0] == target ;
        Arrays.sort(array);
        int i=0, j=array.length - 1;
        while(i<j)
        {
            int sum = array[i]+array[j];
            if(sum == target ) return true;
            else if(sum < target) i++;
            else j--;
        }
        return false;
    }
}
