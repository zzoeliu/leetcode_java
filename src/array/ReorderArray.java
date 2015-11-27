package array;

/**
 * Created by ZoeLiu on 9/21/15.
 */
public class ReorderArray {
    public int[] reorder(int[] array) {
        // write your solution here
        //Step 1 : corner case
        if (array == null || array.length <= 2){
            return array;
        }
        //Step 2: recursively call reorder subfunction to do inplace reorder, we need to deal with odd/even seperately
        int n = array.length;
        if (n%2 == 0){
            dfsHelper(array, 0, n - 1);
        }else{
            dfsHelper(array, 0, n - 2);
        }
        return array;
    }
    private void dfsHelper(int[] array, int left, int right){
        if (left > right)
            return;
        int length = right - left + 1;
        if (length <= 2)
            return;
        int leftLen = (length/4) * 2;// This is really important , we need to consider if length/2 is odd. It would be different from length/4, such as length = 6
        int leftMid = left + leftLen/2;
        int leftEnd = left + leftLen - 1;
        int rightEnd = leftMid + length/2 - 1;
        int shift = leftLen/2;
        reverse(array, rightEnd - shift + 1, rightEnd);
        reverse(array, leftMid, rightEnd - shift);
        reverse(array, leftMid, rightEnd);
        dfsHelper(array, left, leftEnd);
        dfsHelper(array, leftEnd + 1, right);
    }
    private void reverse(int[] array, int left, int right){
        if (left > right)
            return;
        while(left < right){
            swap(array, left++, right--);
        }
    }
    private void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
