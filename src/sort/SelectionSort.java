package sort;

/**
 * Created by ZoeLiu on 7/28/15.
 */
public class SelectionSort {
    public int[] solve(int[] array) {
        // Write your solution here.
        //For selection sort. Divide the array to two parts: sorted part and unsorted //part. Then traverse the array, each time read the min element of the unsorted //part and insert it into proper position of the sorted part, change the boundary. //Do in-place sort
//Corner case: array==null | array.length==0
        if (array == null || array.length == 0) return array;
        int sortEnd = 0;
        while (sortEnd < array.length) {
            int min = array[sortEnd];
            int pos = sortEnd;
            for (int i = sortEnd + 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                    pos = i;
                }
            }
            int temp = array[pos];
            array[pos] = array[sortEnd];
            array[sortEnd] = temp;
            sortEnd++;
        }
        return array;
    }
}
