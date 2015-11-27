package array;

/**
 * Created by ZoeLiu on 10/21/15.
 */
public class longestSubSeq {
    public int longest(int[] array) {
        // Write your solution here.
        if (array == null)
            return 0;
        if (array.length <= 1){
            return array.length;
        }
        int n = array.length;
        int[] dp = new int[n];
        dp[0] = array[0];
        int result = 0;
        for (int i = 1; i < n ; i++){
            int index = findLargestSmaller(dp, 0, result, array[i]);
            if (index == result){
                dp[++result] = array[i];
            }else{
                dp[index + 1] = array[i];
            }
        }
        return result + 1;
    }
    private int findLargestSmaller(int[] array, int start, int end, int target){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(array[mid] >= target){
                end = mid - 1;//duplicate elements , we need to insert this element to its front
            }else{
                start = mid + 1;
            }
            //cause we want the largest index of smallese element
            //array between start and end is in ascending order
        }
        return end;
    }
}
