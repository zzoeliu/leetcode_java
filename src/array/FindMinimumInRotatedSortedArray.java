package array;

/**
 * Created by ZoeLiu on 7/7/15.
 */
public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {

        int length=nums.length;
        if(length==1) return nums[0];
        int former=nums[0];
        int min=Integer.MAX_VALUE;
        for(int i=0;i<length;i++)
        {
            if(nums[i]<former || nums[i]<min)
                min=nums[i];
            former=nums[i];
        }
        return min;

    }
}
