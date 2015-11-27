package hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by ZoeLiu on 7/11/15.
 */
/*public class SingleNumberII {
    public int singleNumber(int[] nums) {
        if(nums.length==1) return nums[0];
        HashMap<Integer,Integer> result=new HashMap<Integer,Integer>();


        for(int i=0;i<nums.length;i++)
        {

            if(result.containsKey(nums[i]))
            {
                int val=result.get(nums[i]);
                result.put(nums[i],val+1);
                if(result.get(nums[i])==3)
                    result.remove(nums[i]);
            }else
                result.put(nums[i],1);
        }
        Set key=result.keySet();

    }
}*/
