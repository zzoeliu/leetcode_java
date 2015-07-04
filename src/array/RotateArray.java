package array;

/**
 * Created by ZoeLiu on 7/4/15.
 * Rotate an array of n elements to the right by k steps.

 For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

 Note:
 Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.

 first:use naive method, create temp array to copy , note that if k>n, we need k=k%n
 second:
 */
public class RotateArray {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        if(k > n)
            k=k%n;

        int[] temp=new int[n];
        int j=0;

        for (int i=n-k;i<n;i++)
        {
            temp[j++]=nums[i];
        }
        for(int i=0;i<n-k;i++)
        {
            temp[j++]=nums[i];
        }
        for(int i=0;i<n;i++)
        {
            nums[i]=temp[i];
        }

    }

}
