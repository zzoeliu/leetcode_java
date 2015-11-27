package sort;

/**
 * Created by ZoeLiu on 9/5/15.
 */
public class sortColors {
    public void sortColors(int[] nums) {
        assert(nums != null && nums.length != 0);
        int i = 0;
        int j = nums.length - 1;
        for(int k = 0; k < nums.length; k++)
        {
            if(nums[k] == 0)
            {
                int temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
                i++;
            }else if(nums[k] == 2)
            {
                int temp = nums[k];
                nums[k] = nums[j];
                nums[j] = temp;
                j--;
            }
        }
    }
}
