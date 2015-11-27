package sort;

/**
 * Created by ZoeLiu on 7/30/15.
 */
public class QuickSort {
    public int[] quickSort(int[] array) {
        // Write your solution here
        if (array == null || array.length <= 1)
            return array;
        sort(array, 0, array.length - 1);
        return array;
    }

    public void sort(int[] array, int start, int end) {
        int index = getPartition(array, start, end);
        if (start < index - 1)
            sort(array, start, index - 1);
        if (index < end  )
            sort(array, index , end );
    }

    public int getPartition(int[] array, int start, int end)
    {
        int i=start,j=end,mid=start+(end-start)/2;
        int pivot=array[mid];
        while(i<=j)
        {
            while(array[i]<pivot) i++;
            while(array[j]>pivot) j--;
            if(i<=j) {
                int temp = array[j];
                array[j]=array[i];
                array[i]=temp;
                i++;
                j--;
            }

        }
        return i;

    }
}
