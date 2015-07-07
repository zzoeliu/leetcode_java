package array;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by ZoeLiu on 7/7/15.
 *
 * Design: 0s is used to divide
 */
public class MaxProductSubarray {
    public int maxProduct(int[] nums) {

        int length=nums.length;
        if(length==0 || nums==null) return 0;
        if(length==1) return nums[0];
        int maxLocal=nums[0];
        int minLocal=nums[0];
        int global=nums[0];

        for(int i=0;i<length;i++)
        {
            int temp=maxLocal;
            maxLocal=Math.max(Math.max(maxLocal*nums[i],nums[i]),nums[i]*minLocal);
            minLocal=Math.min(Math.min(temp*nums[i],nums[i]),nums[i]*minLocal);
            global=Math.max(maxLocal,global);
        }

        return global;
    }
}
